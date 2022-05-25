import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records= {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT",
				"07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT",
				"22:59 5961 IN", "23:00 5961 OUT"};
		//split을 해서 [2]번째가 IN이면 cnt를 1씩 증가시키고 그 개수만큼 배열을 만들어주자
		//그렇게 결과값을 담아줄 result 배열을 만들면(3칸) fee를 해석하자
		// 180은 기본 시간 5000원은 기본 요금 10은 단위 시간(분)이고 600은 단위 요금(원)이다.
		//한번 포문을 쭉 돌려서 cnt 값을 얻어온다. 그걸로 배열의 개수를 정하고, 
		// 그 다음 포문에서는 시간을 분으로 환산해서 OUT-IN을 해준다. 이걸 어떻게해줄것이냐 맵으로 key value 해서 넣을까?
		HashMap<Integer, Integer> car = new HashMap<>();
		
		for(int i=0; i<records.length;i++) {
			
		}
		
	}//main
}//class
