import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        //모든 queue에 있는 값을 넣어 2로 나눠준 변수를 하나 만들고
        Queue<Integer> one = new LinkedList();
        Queue<Integer> two = new LinkedList();
        long plus = 0;
        long data1 = 0;
        long data2 = 0;
        for(int data : queue1){
            one.offer(data);
            data1+=data;
        }
        for(int data : queue2){
            two.offer(data);
            data2+=data;
        }
        plus= data1+ data2;
        if(plus%2 !=0) return -1;//홀수면 값이 같아질 수가 없으니 리턴
        
        plus/=2;    //두 값이 같아졌을 경우의 값
        int cnt1 = 0;
        int cnt2 = 0;
        int limit = queue1.length * 2;
        while(cnt1<=limit && cnt2<= limit){
            if(data1 == plus) return cnt1+ cnt2;
            if(data1>plus){
                data1-= one.peek();
                data2+= one.peek();
                two.add(one.poll());
                cnt1++;
            }else{
                data2-= two.peek();
                data1+= two.peek();
                one.add(two.poll());
                cnt2++;
                
            }
        }
        return -1;
    }
}