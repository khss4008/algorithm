import java.util.Scanner;

public class Boj2502 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int K = sc.nextInt();
		
		int[] dp = new int[31];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=30;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		int A = 1;
		int B;
		while(true) {
			if((K-dp[D-3]*A)%dp[D-2] ==0) {
				B = (K-dp[D-3] * A)/dp[D-2];
				break;
			}
			A++;
		}
		System.out.println(A);
		System.out.println(B);
	}
}
