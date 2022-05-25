package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj4949 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		String s = br.readLine();
		if(s.equals(".")) {
			break;
		}
		System.out.println(solve(s));
		}
	}
	
	public static String solve(String s) {
		Stack<Character> st = new Stack();
		
		for(int i=0;i<s.length();i++) {
			char q = s.charAt(i);
			
			if(q=='('||q=='[') {
				st.push(q);
				
			}
			else if(q==')') {
				if(st.empty() || st.peek()!='(') {
					return "no";
				}else {
					st.pop();
				}
				
			}else if(q==']') {
				if(st.empty()||st.peek()!='[') {
					return "no";
				}else {
					st.pop();
				}
			}
		
		}
			if(st.empty()) {
				return "yes";
			}else {
				return "no";
			}
			
		}


}
	
	
	
	
