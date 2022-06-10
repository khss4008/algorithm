import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] card;
	static int N; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		card = new int[N];
		for(int i=0; i<N;i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		
		int M = sc.nextInt();
		for(int i=0; i<M;i++) {
			sb.append(binarySearch(sc.nextInt())).append(" ");
		}
		System.out.println(sb);
	}//main
	
	static int binarySearch(int num) {
		int first = 0;
		int last = N -1;
		int mid = 0;
		while(first<=last) {
			mid = (first + last) /2;
			
			if(card[mid] == num) return 1;
			if(card[mid] < num) {
				first = mid+1;
			}else {
				last = mid -1;
			}
			
		}
		return 0;
	}
	
}//class
