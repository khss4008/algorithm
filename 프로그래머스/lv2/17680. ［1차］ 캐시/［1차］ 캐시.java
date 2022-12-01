import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> list = new LinkedList();
        for(int i=0; i<cities.length;i++){
            String city = cities[i].toUpperCase();
            if(list.indexOf(city)!=-1){
                answer+=1;
                list.remove(list.indexOf(city));
                list.add(city);
            }else{
                answer+=5;
                
                if(cacheSize!=0) list.add(city);
                
                if(list.size()>cacheSize) list.removeFirst();
            }
        }
        return answer;
    }
}