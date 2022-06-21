import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int[] sq1 = { sc.nextInt(),sc.nextInt()};
		int[] sq2 = { sc.nextInt(),sc.nextInt()};
		int[] sq3 = { sc.nextInt(),sc.nextInt()};
		
		if(sq1[0] == sq2[0]) {
			sq1[0] = 0;
			sq2[0] = 0;
			System.out.print(sq3[0]+" ");
		}else if(sq2[0] == sq3[0]) {
			sq2[0] = 0;
			sq3[0] = 0;
			System.out.print(sq1[0]+" ");
		}else if(sq3[0] == sq1[0]) {
			sq3[0] = 0;
			sq1[0] = 0;
			System.out.print(sq2[0]+" ");
		}
		
		
		if(sq1[1] == sq2[1]) {
			sq1[1] = 0;
			sq2[1] = 0;
			System.out.println(sq3[1]);
		}else if(sq2[1] == sq3[1]) {
			sq2[1] = 0;
			sq3[1] = 0;
			System.out.println(sq1[1]);
		}else if(sq3[1] == sq1[1]) {
			sq3[1] = 0;
			sq1[1] = 0;
			System.out.println(sq2[1]);
		}
		
	}//main
}//class
