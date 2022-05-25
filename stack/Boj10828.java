package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10828 {
	public static void main(String[] args) throws IOException {
		
		Stack<Integer> s = new Stack<Integer>();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int tC = Integer.parseInt(sc.readLine());
		
		for(int i=0; i<tC;i++) {
			String key = sc.readLine();						
			if(key.contains("push")) {
				String[] div = key.split(" ");
				int divNum = Integer.parseInt(div[1]);
				s.push(divNum);
			}else if(key.equals("pop")) {
				if(s.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(s.pop());
				}
			}else if(key.equals("size")) {
				System.out.println(s.size());
			}else if(key.equals("empty")) {
				if(s.isEmpty()){
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(key.equals("top")) {
				if(s.isEmpty()){
					System.out.println(-1);
				}else {
					System.out.println(s.peek());
				}
			}
		}
		
		
	}
}

