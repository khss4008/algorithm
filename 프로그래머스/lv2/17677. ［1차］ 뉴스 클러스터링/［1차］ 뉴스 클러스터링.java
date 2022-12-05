import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> multi1 = new ArrayList();
        List<String> multi2 = new ArrayList();
        List<String> intersection = new ArrayList();
        List<String> union = new ArrayList();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for(int i=0; i<str1.length()-1;i++){
            char one = str1.charAt(i);
            char two = str1.charAt(i+1);
            
            if(one >='a' && one<='z' && two >='a' && two<='z') multi1.add(one+""+two);
        }
        for(int i=0; i<str2.length()-1;i++){
            char one = str2.charAt(i);
            char two = str2.charAt(i+1);
            
            if(one >='a' && one<='z' && two >='a' && two<='z') multi2.add(one+""+two);
        }
        
        Collections.sort(multi1);
        Collections.sort(multi2);
        
        for(int i=0; i<multi1.size();i++){
            if(multi2.remove(multi1.get(i))){
                intersection.add(multi1.get(i));
            }
            union.add(multi1.get(i));
        }
        
        for(int i=0; i<multi2.size();i++){
            union.add(multi2.get(i));
        }
        // for(String s : multi1){
        //     if(multi2.remove(s)){
        //         intersection.add(s);
        //     }
        //     union.add(s);
        // }
        // for(String s: multi2){
        //     union.add(s);
        // }
        
        double jakad = 0;
        
        if(union.size()==0){
            jakad = 1;
        }else{
            jakad = (double)intersection.size() / (double) union.size();
        }
        
        return (int) (jakad * 65536 );
    }
}