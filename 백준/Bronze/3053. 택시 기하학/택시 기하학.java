import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		System.out.println(N * N * Math.PI);
		System.out.println(2 * N * N);
	}
}