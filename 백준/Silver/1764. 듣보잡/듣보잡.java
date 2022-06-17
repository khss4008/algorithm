import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		int N = Integer.parseInt(data[0]);
		int M = Integer.parseInt(data[1]);
		String[] dut = new String[N];
//		String[] bo = new String[M];
		for(int i =0; i<N;i++) {
			dut[i] = br.readLine();
		}
		HashSet<String> bo = new HashSet<>();
		for(int j=0; j<M;j++) {
			bo.add(br.readLine());
		}
		List<String> list = new ArrayList<String>();
		for(int i=0; i<N;i++) {
				if(bo.contains(dut[i])) {
					list.add(dut[i]);
			}
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}//main
}//class
