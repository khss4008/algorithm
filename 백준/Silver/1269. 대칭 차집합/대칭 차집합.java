import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		int N = Integer.parseInt(data[0]);
		int M = Integer.parseInt(data[1]);
		
		int[] arrN = new int[N];
		int[] arrM = new int[M];
		String[] dataN = br.readLine().split(" ");
		String[] dataM = br.readLine().split(" ");
		HashSet<Integer> setN = new HashSet<>();
		HashSet<Integer> setM = new HashSet<>();
		
		for(int i= 0; i<N;i++) {
			arrN[i] = Integer.parseInt(dataN[i]);
			setN.add(Integer.parseInt(dataN[i]));
		}
		for(int i= 0; i<M;i++) {
			arrM[i] = Integer.parseInt(dataM[i]);
			setM.add(Integer.parseInt(dataM[i]));
		}
		int cnt = 0; 
		for(int i=0; i<N;i++) {
			if(!setM.contains(arrN[i])) {
				cnt++;
			};
		}
		for(int i=0; i<M;i++) {
			if(!setN.contains(arrM[i])) {
				cnt++;
			};
		}
		
		System.out.println(cnt);
	}//main
}//class
