
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stk = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            // --> 한줄을 통으로 읽음
            StringTokenizer st = new StringTokenizer(s);
            int command = Integer.parseInt(st.nextToken());
            if(command == 1) {
                int num = Integer.parseInt(st.nextToken());
                stk.push(num);
            }
            else if(command == 2) {
                if(stk.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stk.pop());
                }
            }
            else if(command == 3) {
                System.out.println(stk.size());
            }
            else if(command == 4) {
                if(stk.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if(command == 5) {
                if(stk.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stk.peek());
                }
            }
        }
    }
}