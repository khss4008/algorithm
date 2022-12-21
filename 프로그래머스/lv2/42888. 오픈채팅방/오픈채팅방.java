import java.util.*;
class Solution {
    public String[] solution(String[] record) {

        HashMap<String, String> map = new HashMap();
        int cnt = 0;
        for(int i=0; i<record.length;i++){
            String[] data = record[i].split(" ");
            
            if(data.length<3){
                continue;
            }else if(data[0].equals("Enter")){
                map.put(data[1],data[2]);
            }else{
                map.put(data[1],data[2]);
                cnt++;
            }
        }
        
        int idx = 0;
        String[] answer = new String[record.length - cnt];
        for(int i=0; i<record.length;i++){
            String[] data = record[i].split(" ");
            String nick = map.get(data[1]);
            
            if(data[0].equals("Enter")){
                answer[idx++] = nick + "님이 들어왔습니다.";
            }else if(data[0].equals("Leave")){
                answer[idx++] = nick + "님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}