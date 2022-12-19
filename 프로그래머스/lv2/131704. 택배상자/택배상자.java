import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        int def = 1;
        int idx = 0;
        
        while(true){
            if(!stack.isEmpty() && order[idx] == stack.peek()){
                answer++;
                
                idx++;
                stack.pop();
                continue;
            }
            
            if(def > order.length) break;
            
            if(order[idx] == def){
                answer++;
                
                idx++;
                def++;
                continue;
            }
            stack.push(def);
            def++;
            
        }
        
        return answer;
    }
}