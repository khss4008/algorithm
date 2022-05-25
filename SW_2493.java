import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SW_2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		int tc = 10; 
		for(int i=0; i<tc;i++) {
			int N=Integer.parseInt(br.readLine());
			char[] gC = new char[N];
			String g = br.readLine();
			//데이터를 배열에 넣는 과정
			for(int j=0; j<N;j++) {
				gC[j]=g.charAt(j);
			}
			//괄호 인식하기
			for(int j=0; j<N;j++) {
				if(gC[j]=='('||gC[j]=='['||gC[j]=='{'||gC[j]=='<') {
					stack.push(gC[j]);
				}else if(stack.isEmpty()&&(gC[j]==')'||gC[j]==']'||gC[j]=='}'||gC[j]=='>')) {
					stack.push(gC[j]);
					break;
				}else if(stack.peek()=='('&& gC[j]==')') {
					stack.pop();
				}else if(stack.peek()=='['&& gC[j]==']') {
					stack.pop();
				}else if(stack.peek()=='{'&& gC[j]=='}') {
					stack.pop();
				}else if(stack.peek()=='<'&& gC[j]=='>') {
					stack.pop();
				}else {
					stack.push('1');
					break;
				}
			}if(stack.isEmpty()) {
				System.out.println("#"+(i+1)+" 1");
			}else {
				System.out.println("#"+(i+1)+" 0");
			}
			stack.removeAllElements();
		}
	
	
	
	
	}
}
