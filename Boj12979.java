import java.util.Scanner;

public class Boj12979 {
    static int min = Integer.MAX_VALUE;
    static int w, h;
    static int target;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        target = sc.nextInt();

        for (int i = 1; i <= target; i++) {	
            if (target % i != 0) continue;	

            int j = target / i; 					//i와 j를 곱하면 12(target)가 나오게 됨
            int cnt = f(i, j);
            if (cnt != -1 && cnt < min) {
                min = cnt;
            }
        }

        System.out.println(min != Integer.MAX_VALUE ? min : -1);
    }

    static int f(int a, int b) {		//경우의 수에서 들어온 값으로 걸러내는 작업
        int v1 = g(w, a, 0);
        int v2 = g(h, b, 0);
        if (v1 == -1 || v2 == -1) return -1;
        return g(w, a, 0) + g(h, b, 0);
    }

    static int g(int from, int to, int cnt) {

        if (from == to) {	//같으면 접을 필요가 없으므로 안접고 0 리턴
            return 0;
        }

        if (to > from) {		//길이가 5인데 길이 6, 7, 8을 만든다는건 불가능하므로 
            return -1;
        }

        if (div(from) <= to) {	//접었을 때 값(3)이 to(4)보다 작으면 5에서 4로도 접을 수 있으므로 1번 접고 리턴
            return cnt + 1;
        }

        return g(div(from), to, cnt + 1);	//위의 조건들이 만족하지 않으면 한번 반으로 접고 접은 횟수 늘리면서 재귀
    }

    static int div(int len) {//종이를 접을때를 생각해보면, 짝수이면 딱 반으로 접어지는데, 홀수이면 반보다 한칸 튀어나올 수밖에 없다 
        if (len % 2 == 0) {
            return len / 2;
        } else {
            return len / 2 + 1;
        }
    }
}
