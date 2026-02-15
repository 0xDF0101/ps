
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Stack<Integer> stk = new Stack<>();

        int K = sc.nextInt();

        int sum = 0;
        for(int i=0; i<K; i++) {
            int input = sc.nextInt();
            if(input == 0) {
                stk.pop();
                continue;
            }
            stk.push(input);
        }

        int size = stk.size();
        for(int i=0; i<size; i++) {
            sum += stk.peek();
            stk.pop();
        }

        System.out.println(sum);

    }
}