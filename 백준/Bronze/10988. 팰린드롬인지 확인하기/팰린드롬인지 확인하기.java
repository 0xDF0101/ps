
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bufferedReader.readLine();

        Deque<Character> stk = new ArrayDeque<>();

        for(int i=0; i<str.length(); i++) {
            stk.addFirst(str.charAt(i));
        }

        boolean isPelindrom = true;

        for(int i=0; i<str.length(); i++) {
            if(stk.pop() != str.charAt(i)) {
                isPelindrom = false;
                break;
            }
        }

        if(isPelindrom) {
            bufferedWriter.write("1");
        } else {
            bufferedWriter.write("0");
        }


        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}