import java.util.ArrayList;
import java.util.List;

public class Main_K진수 {
	public static void main(String[] args) {
		int num = 110011;
		int k = 10;
		String ans = "";
		while(num>0) {
			ans=(num%k)+ans;
			num/=k;
		}
		System.out.println(ans);
		List<Integer> list = new ArrayList<>();
		String ansD="";
		for(int i=0; i<ans.length()+1;i++) {
			if(ans.length()>i&&ans.charAt(i)!='0') {
				ansD+=ans.charAt(i);
			}else {
				if(ansD.equals("")) {
					continue;
				}else {					
				list.add(Integer.parseInt(ansD));
				ansD="";
				}
			}
		}
		System.out.println(list);
		int cnt=0;
		for(int i=0; i<list.size();i++) {
			for(int j=1;j<list.get(i);j++) {
				if(list.get(i)==2){
					cnt++;
					break;
				}
				if(list.get(i) % j==0) {
					continue;
				}else if(list.get(i) % j!=0){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}//main
}//class
