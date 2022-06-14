import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		int N = Integer.parseInt(data[0]);
		int M = Integer.parseInt(data[1]);
		int cnt = 0; 
		String[] arr = new String[N];
		for(int i=0 ; i<N;i++) {
			arr[i] = br.readLine();
		}
		for(int i=0; i<M;i++) {
			String word = br.readLine();
			for(int j=0; j<N;j++) {
				if(word.equals(arr[j])) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}//main
}//class
