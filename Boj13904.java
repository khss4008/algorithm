import java.io.*;
import java.util.*;

public class Boj13904 {

	static int N;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		List<Homework> list = new ArrayList<>();
		int maxDay = 0;

		for (int i = 0; i < N; i++) {

			String[] input = br.readLine().split(" ");

			int d = Integer.parseInt(input[0]);
			int w = Integer.parseInt(input[1]);

			list.add(new Homework(d, w));
			maxDay = Math.max(maxDay, d);	//가장 높은 일차 찾기
		}	//데이터 담기

		int sum = 0;

		for (int i = maxDay; i >= 1; i--) {	//마지막날부터 반복

			Homework ans = new Homework(0, 0);	//값 담을 변수 만들어놓고

			for (Homework hw : list) {	//foreach로 안의 요소만큼 반복
				if (hw.d >= i) {		//처음값은 maxDay(데이터중 가장 높은 일차)인데, maxDay보다 크거나 같을 경우  
					if (ans.w < hw.w) {	// ans에 담겨질 w중 가장 큰 값을 찾아서 넣어줌
						ans = hw;
					}
				}
			}

			sum += ans.w;				//더해주고 
			list.remove(ans);			//더한 값 일 했으니까 지워주고 다시 반복
		}

		bw.write(sum + "\n");
		bw.flush();

	}

	static class Homework {

		int d, w;

		Homework(int d, int w) {
			this.d = d;
			this.w = w;
		}

	}

}