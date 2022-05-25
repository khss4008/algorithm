import java.util.Arrays;
import java.util.Scanner;

public class Boj14613 {
	public static void main(String[] args) {
		double w_r, l_r, d_r;
		double b,s,g,p,d;
		double[][] dp = new double[21][41];
		int score;
		b = 0.0;s=0.0;g=0.0;p=0.0;d=0.0;	//변수 초기화
		Scanner sc = new Scanner(System.in);
		w_r = sc.nextDouble();		//이길 확률
		l_r = sc.nextDouble();		//질 확률
		d_r = sc.nextDouble();		//비길 확률
		for(int i=0; i<=40;i++) {	//배열 값 초기화
			dp[0][i] = 0;
		}
		dp[0][20] = 1;
		
		//i가 게임 횟수
		//j가 랭크
		for(int i=1; i<=20; i++) {
			for(int j=0; j<=40; j++) {		//
				if(j==0) dp[i][j] = (dp[i-1][j+1]* l_r);
				
				else if(j==40) dp[i][j] = (dp[i-1][j-1]* w_r);
				
				else {
					dp[i][j] = (dp[i-1][j+1] * l_r)+(dp[i-1][j] * d_r) + (dp[i-1][j-1] * w_r);
				}
					
			}
			System.out.println(Arrays.toString(dp[i]));
		}
		
		for(int i=0; i<10; i++) b+= dp[20][i];
		for(int i=10; i<20; i++) s+= dp[20][i];
		for(int i=20; i<30; i++) g+= dp[20][i];
		for(int i=30; i<40; i++) p+= dp[20][i];
		
		d= dp[20][40];
		System.out.printf("%.8f\n",b);
		System.out.printf("%.8f\n",s);
		System.out.printf("%.8f\n",g);
		System.out.printf("%.8f\n",p);
		System.out.printf("%.8f\n",d);
	}//main
}//class
