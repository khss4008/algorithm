import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_2164 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n;i++) {
			q.offer(i);
		}
		int result = 0;
		while(q.size()>1) {
			q.poll();
			result = q.poll();
			q.offer(result);
		}
		System.out.println(q.poll());
		
	}//main
}//class
