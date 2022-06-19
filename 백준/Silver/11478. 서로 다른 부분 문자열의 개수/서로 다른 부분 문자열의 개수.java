import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		HashSet<String> list = new HashSet<String>();
		
		int cnt=1;
		while(cnt!=word.length()) {
			
			for(int i=0; i<word.length();i++) {
				if((i+cnt)>word.length())break;
				list.add(word.substring(i,i+cnt));
			}
			cnt++;
		}
		list.add(word);
		System.out.println(list.size());
//		System.out.println(list);
	}//main
}//class
