import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Boj18870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] origin = new int[N];
		int[] sorted = new int[N];
		
		for(int i=0; i<N;i++) {
			origin[i] = sorted[i] = sc.nextInt();
		}
		
		Arrays.sort(sorted);
		HashMap<Integer, Integer> ranking = new HashMap<>();
		int rank = 0;
		for(int v: sorted) {
			
			if(!ranking.containsKey(v)) {//v라는 key값이 Map 안에 없다면
				ranking.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb= new StringBuilder();
		for(int v:origin) {
			int res = ranking.get(v);
			sb.append(res).append(" ");
		}
		System.out.println(sb);
	}//main
}//class
