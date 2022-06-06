import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1427 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] arr = new int[N.length()];
		for(int i=0; i<N.length();i++) {
			arr[i] = Character.getNumericValue(N.charAt(i));
		}
		Arrays.sort(arr);
		int[] reverseArr = new int[arr.length];
		for(int i=reverseArr.length-1, j=0 ; i>=0 ;i--,j++) {
			reverseArr[j] = arr[i];
		}
		String num = "";
		for(int i =0 ; i<arr.length;i++) {
			num+=reverseArr[i];
		}
		System.out.println(num);
	}//main
}//class
