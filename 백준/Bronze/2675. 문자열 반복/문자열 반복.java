

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            String str = sc.next();

            for(int k=0; k<str.length(); k++) {
                for(int j=0; j<num; j++) {
                    System.out.print(str.charAt(k));
                }
            }
            System.out.println();
        }



    }
}