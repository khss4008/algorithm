import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Sale sale = new Sale();
        
        for(int i=0; i<discount.length-9;i++){
            for(int j=i; j<10+i;j++){
                sale.put(discount[j]);
            }
            if(sale.check(want, number)){
                answer++;
            }
            sale.clear();
        }
        
        
        return answer;
    }
    
    public static class Sale{
    
    Map<String, Integer> map = new HashMap<>();

        public void put(String food) {
            map.put(food, map.getOrDefault(food, 0) + 1);
        }

        public boolean check(String[] want, int[] number) {
            for (int i = 0; i < want.length; i++) {
                if (!map.containsKey(want[i]) || map.get(want[i]) != number[i]) {
                    return false;
                }
            }
            return true;

        }

        public void clear() {
            map.clear();
        }
    
    }
    
}

