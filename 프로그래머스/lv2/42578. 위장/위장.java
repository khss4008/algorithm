import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap();
        for(int i=0; i<clothes.length;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        Set<String> set = map.keySet();
        //경우의 수 = 상의 0/ 1 하의 0/ 1/ 2 일 경우 총 6가지의 경우의 수 중 하나도 안입는 경우의 수를 빼고 계산
        for(String key : set){
            answer*= map.get(key)+1;
        }
        
        return answer-1;
    }
}