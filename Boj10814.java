import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Boj10814 {
	public static class Member{
		int num;
		String name;
		
		public Member(int num, String name) {
			super();
			this.num = num;
			this.name = name;
		}
		@Override
		public String toString() {
			return this.num + " "+this.name;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Member[] arr = new Member[N];
		for(int i=0; i<N;i++) {
			String[] data = br.readLine().split(" ");
			arr[i] = new Member(Integer.parseInt(data[0]), data[1]);
		}
			Arrays.sort(arr, new Comparator<Member>() {
				@Override
				public int compare(Member o1, Member o2) {				
					return o1.num - o2.num;
				}
			});
			
			for(int i=0; i<N;i++) {
				sb.append(arr[i]).append("\n");
			}
			
			System.out.println(sb);
	}//main
}//class
