import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length;i++){
            int cnt = 0;
            
            for(int j=0; j<citations.length;j++){
                if(citations[j]>answer){
                    cnt++;
                }
            }
            if(cnt>answer) answer++;
        }
        int cnt = 0;
        
        for(int i=0; i<citations.length;i++){
            if(citations[i]!=0){
                cnt++;
            }
        }
        if(cnt ==0) answer = 0;
        
        return answer;
    }
}