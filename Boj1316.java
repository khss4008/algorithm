import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] check = new int[26];
		int cnt = 0;
		for(int i=0; i<N;i++) {
			String word = br.readLine();
			for(int j=0; j<word.length()-1;j++) {
				if(word.charAt(j)==word.charAt(j+1)) {
//					continue;
				}else {
					check[word.charAt(j)-'a']++;
				}
				if(j== word.length()-2) {
					check[word.charAt(j+1)-'a']++;
				}
			}
//			System.out.println(Arrays.toString(check));
			for(int j=0; j<check.length;j++) {
				if(check[j]>1) {
					cnt++;
					break;
				}
			}
			for(int j=0; j<check.length;j++) {
				check[j]=0;
			}
			
		}
		System.out.println(N-cnt);
	}//main
}//class
