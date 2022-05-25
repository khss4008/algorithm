import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1913 {
	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};
							//하,우,상,좌
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int[][] snail = new int[N][N];
		int y = 0;
		int x = 0;
		int cnt = N*N;
		int dm = 0; 
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<N;j++) {
				snail[y][x]=cnt--;
				if(dm==0) {
					if(y+dy[dm]>=N||snail[y+dy[dm]][x]!=0) dm=1;
				}else if(dm==1) {
					if(x+dx[dm]>=N||snail[y][x+dx[dm]]!=0) dm=2;
				}else if(dm==2) {
					if( y+dy[dm]<0||snail[y+dy[dm]][x]!=0) dm=3;
				}else if(dm==3) {
					if(x+dx[dm]<0||snail[y][x+dx[dm]]!=0) dm=0;
				}
				y+=dy[dm];
				x+=dx[dm];
			}
		}
		int xc=0;
		int yc=0;
		for(int i=0;i<N;i++) {
			for(int j=0; j<N;j++) {
				sb.append(snail[i][j]+ " ");
				if(snail[i][j]==num) {
					xc=i;
					yc=j;
				}
			}
			sb.append("\n");
		}
		sb.append((xc+1)+" "+(yc+1));
		System.out.print(sb);
	}
}
