import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String[] data = br.readLine().split(" ");
			
			int one = Integer.parseInt(data[0]);
			int two = Integer.parseInt(data[1]);
			int three = Integer.parseInt(data[2]);
			
			
			if(one == 0 && two == 0 && three == 0)break;
			
			if((one*one)+(two*two) == (three*three))System.out.println("right");
			else if((one*one)+(three*three) == (two*two))System.out.println("right");
			else if((three*three)+(two*two) == (one*one))System.out.println("right");
			else System.out.println("wrong");
			
		}
		
		
	}//main
}//class
