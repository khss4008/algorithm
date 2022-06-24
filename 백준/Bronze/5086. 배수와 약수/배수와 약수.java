import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] data = br.readLine().split(" ");
			int N = Integer.parseInt(data[0]);
			int M = Integer.parseInt(data[1]);
			if(N == 0 && M == 0) break;
			boolean check1 = false;
			boolean check2 = false;
			
			if(M % N ==0) check1 = true;
			if(N % M == 0) check2 = true;
			
			if(check1) System.out.println("factor");
			if(check2) System.out.println("multiple");
			if(!check1&&!check2)System.out.println("neither");
		}
		
	}//main
}//class
