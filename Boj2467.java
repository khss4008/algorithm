import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2467 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
//		List<Integer> san = new ArrayList<>();
//		List<Integer> al = new ArrayList<>();
		String[] data = br.readLine().split(" ");
		int[] arr = new int[N];
		for(int i=0; i<N;i++) {
			arr[i] = Integer.parseInt(data[i]);
		}	//데이터 받기 
		
		int left = 0; //투포인터 할거임
		int right = N-1;
		int Cl = 0;		//left right값 받아줄 변수
		int Cr = 0;
		long min = Long.MAX_VALUE;		//최솟값 찾아 넣을 변수
		while(left<right) {	//왼쪽 포인터가 오른쪽 포인터보다 작을 경우에 계속 반복
			long sum = arr[left]+arr[right];	//왼쪽과 오른쪽 더해줘 
			if(min> Math.abs(sum)) {
				min = Math.abs(sum);	//더작으면 넣어
				Cl = left;			//넣은 인덱스 저장
				Cr = right;
			}
			if(sum>=0) {		//0이 기준이므로 0보다 크면 right를 내려 그럼 더 작은 right수가 나올테니까
				right--;
			}else {					//0보다 작으면 left를 올려 
				left++;
			}
		}
		System.out.println(arr[Cl] + " "+ arr[Cr]);
		
		
		
//시간초과 완탐
//		for(int i=0; i<N;i++) {
//			if(Integer.parseInt(data[i])>0) {
//				san.add(Integer.parseInt(data[i]));
//			}else {
//				al.add(Integer.parseInt(data[i]));
//			}
//		}
//		Collections.sort(san);
//		Collections.sort(al);
//		System.out.println(san);
//		System.out.println(al);
//		int min = Integer.MAX_VALUE;
//		int resultA = 0;
//		int resultB = 0;
//		for(int i=0 ; i<san.size();i++) {
//			for(int j=0; j<al.size();j++) {
//				if(min>Math.abs(san.get(i)+ al.get(j))) {
//					min = Math.min(Math.abs(san.get(i)+ al.get(j)),min);
//					resultA = al.get(j);
//					resultB = san.get(i);
//				}
//			}
//		}
//		System.out.println(resultA + " " + resultB);
		
		
		
		
		
	}//main
}//class
