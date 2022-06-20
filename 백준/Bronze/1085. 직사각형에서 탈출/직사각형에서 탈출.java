import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int xResult = 0;
		int yResult = 0;
		if(Math.abs(x-w)>=x) {
			xResult = x;
		}else {
			xResult = Math.abs(x-w);
		}
		
		if(Math.abs(y-h)>=y) {
			yResult = y;
		}else {
			yResult = Math.abs(y-h);
		}
		
		int result = (xResult >= yResult) ? yResult : xResult;
		System.out.println(result);
		
	}//main
}//class
