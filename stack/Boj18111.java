package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		int N = Integer.parseInt(data[0]);
		int M = Integer.parseInt(data[1]);
		int B = Integer.parseInt(data[2]);
		
		int[][] map = new int[N][M];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N;i++) {
			String[] arrD = br.readLine().split(" ");
			for(int j=0; j<M;j++) {
				map[i][j] = Integer.parseInt(arrD[j]);
				
				max = Math.max(max, map[i][j]);
				min = Math.min(min, map[i][j]);
			}
//			System.out.println(Arrays.toString(map[i]));
		}//data받아오기
		
		int time = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		
		for(int i=min; i<=max;i++) {		//제일 낮은 값에서 제일 높은 값만큼 반복
			int seconds = 0;
			int inventory = B;
			
			for(int j=0; j<map.length;j++) {					//배열 반복
				for(int k = 0; k<map[j].length;k++) {
					int check = map[j][k] -i;						//각 땅의 값에 제일 낮은 값부터 제일 높은값까지 한번씩 빼봄
					
					if(check > 0) {										//check가 양수면  블록을 제거하고 인벤토리에 넣기 
						seconds += Math.abs(check) *2;		//2초 걸림
						inventory+=Math.abs(check);				//인벤토리에 흙 집어넣기
					}else if(check<0) {
						seconds += Math.abs(check);				//음수면 블록 빼서 흙 쌓기
						inventory-=Math.abs(check);				//인벤토리에서 빼기
					}
				}
			}
			
			if(inventory>=0) {										
				if(seconds<=time) {
					time = seconds;
					h = i;
				}
			}
		}
		System.out.println(time + " "+ h);
	}//main
}//class
