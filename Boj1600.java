import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1600 {
	
	static int K, W, H;
	static int[] hdx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] hdy = {-1, 1, -2, 2, -2, 2, -1, 1};
	static int[] dx = {-1,0,1,0};//좌상우하
	static int[] dy = {0,-1,0,1};
	static boolean[][][] visited;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		String[] wh = br.readLine().split(" ");
		W = Integer.parseInt(wh[0]);
		H = Integer.parseInt(wh[1]);
		int[][] map = new int[H][W];
		for(int i=0; i<H;i++) {
			String[] data = br.readLine().split(" ");
			for(int j=0; j<W;j++) {
				map[i][j] = Integer.parseInt(data[j]);
			}
//			System.out.println(Arrays.toString(map[i]));
		}//데이터 받기
		
		visited = new boolean[H][W][K+1];
		
		
		
	}//main
}//class
