import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 생각을 해보자
		 날짜는 총 7일이고, 1일에 3일짜리 일을 하면 1일 포함 2 3일에 일을 못해
		 즉 변수를 0으로 해놓고, 6일때까지만 값을 더할 수 있게 하고, 
		 이걸 브루트 포스로 적용하려면
		 3+1+1
		 3+1+2
		 3+1+2 이런식으로 진행해야 하는데, 
		 만약 Ti가 일+Ti<6일 경우만 브루트 포스에 들어갈 수 있게끔
		 일단 값을 각 리스트에 다 넣고, 
		 일단 데이터를 받자
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] T = new int[N+5];
		int[] P = new int[N+5];
		//데이터 받기
		for(int i=0; i<N;i++) {
			String[] data = br.readLine().split(" ");
			T[i] = Integer.parseInt(data[0]);
			P[i] = Integer.parseInt(data[1]);
		}
		int[] dp = new int[N+1];
		
		for(int i=0; i<N;i++) {
			if(i+T[i]<=N) {
				dp[i+T[i]] = Math.max(dp[i+T[i]],  dp[i]+P[i]);
				
				
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(dp[N]);
	}//main
}//class
