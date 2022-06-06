import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Boj1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] word = new String[N];
		for(int i=0; i<N;i++) {
			word[i] = br.readLine();
		}
//		System.out.println(Arrays.toString(word));
		Arrays.sort(word, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) return o1.compareTo(o2); 
				else return o1.length()-o2.length();
			}
		});
//		for(int i=0; i<N;i++) {
//			System.out.println(word[i]);
//		}
//		System.out.println(Arrays.toString(word));
		System.out.println(word[0]);
		for(int i=1; i<N;i++) {
			if(!word[i].equals(word[i-1])) {
				System.out.println(word[i]);
			}
		}
		
	}//main
}//class
