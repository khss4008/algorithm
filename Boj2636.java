import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2636 {
	static int[][] map;
	static boolean[][] check;
	static int time = 0;
	static int result = 0;
	static int N;
	static int M;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xy = br.readLine().split(" ");
		N = Integer.parseInt(xy[0]);
		M = Integer.parseInt(xy[1]);
		map = new int[N][M];
		for(int i=0; i<N;i++) {
			String[] data = br.readLine().split(" ");
			for(int j=0; j<M;j++) {
				map[i][j]=Integer.parseInt(data[j]);
			}
		}//데이터 읽어오기
		
		while(true) {
			check = new boolean[N][M];
			outair(0,0);
			
			for(int i=0; i<N;i++) {
				for(int j=0; j<M;j++) {
					if(map[i][j]==1&& isEdgeCheese(i,j)) {
						DFS(i,j);
					}
				}
			}
			change();
			
			changeAir();
			
			time++;
			
			int temp= cheese();
			if(temp!=0) result=cheese();
			else break;
		}

		System.out.println(time);
		System.out.println(result);
//		for(int i=0; i<N;i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
//		for(int i=0; i<N;i++) {
//			System.out.println(Arrays.toString(check[i]));
//		}
//		
	}//main
	private static int cheese() {
		int cnt=0;
		for(int i=0; i<N;i++) {
			for(int j=0; j<M;j++) {
				if(map[i][j]==1) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	private static void changeAir() {
		for(int i=0; i<N;i++) {
			for(int j=0; j<M;j++) {
				if(map[i][j]==2) {
					map[i][j]=0;
				}
			}
		}
	}
	private static void change() {
		for(int i=0; i<N;i++) {
			for(int j=0; j<M;j++) {
				if(map[i][j]==-2) {
					map[i][j]=2;
				}
			}
		}
		
	}
	private static void DFS(int r, int c) {
		check[r][c] = true;
		map[r][c] = -2;
		
		for(int i=0; i<4;i++) {
			int nr = r+dr[i];
			int nc = c+dc[i];
			if(map[nr][nc]==1 && !check[nr][nc]&& isEdgeCheese(nr,nc)) {
				DFS(nr,nc);
			}
		}
		
	}
	private static boolean isEdgeCheese(int r, int c) {
		for(int i=0; i<4;i++) {
			int nr = r+dr[i];
			int nc = c+dc[i];
			if(map[nr][nc]==2)return true;
		}
		
		return false;
	}
	private static void outair(int r, int c) {
		check[r][c] = true;
		map[r][c] = 2;
		for(int i=0; i<4;i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if(nr>=0 && nr<N && nc >=0 && nc<M) {
				if(map[nr][nc]==0 && !check[nr][nc]) {
					outair(nr,nc);
				}
			}
		}
		
	}
}//class
