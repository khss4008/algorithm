package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class Boj9012 {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tC = Integer.parseInt(br.readLine());
		for(int i = 0; i<tC;i++) {
			String vps = br.readLine();
			System.out.println(solve(vps));
		}
	}
	
	public static String solve(String s) {
		Stack st = new Stack();
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push('(');
			}else if(st.isEmpty()) {
				return "NO";
			}else {
				st.pop();
			}
		}
		
		if(st.isEmpty()) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	
}
