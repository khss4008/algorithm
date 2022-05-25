package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack st = new Stack();
		int tC= Integer.parseInt(br.readLine());
		for(int i=0; i<tC;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				st.pop();
			}else {
				st.add(num);
			}
		}
		int sum=0;
		for(int i=0; i<st.size();i++) {
			sum+=(int)st.get(i);
		}
		System.out.println(sum);
	}
}
