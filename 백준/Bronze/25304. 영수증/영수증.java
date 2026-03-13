import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = Integer.parseInt(bufferedReader.readLine());

        String inputN = bufferedReader.readLine();
        int N = Integer.parseInt(inputN);


        int resultSum= 0;

        for(int i=0; i<N; i++) {
            String input = bufferedReader.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());

            resultSum += price * quantity;
        }

        if(sum == resultSum) {
            bufferedWriter.write("Yes");
        } else {
            bufferedWriter.write("No");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}