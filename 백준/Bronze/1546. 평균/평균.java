
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] scores = new int[N];

        int max = 0;
        for(int i=0; i<N; i++) {
            scores[i] = sc.nextInt();
            if(scores[i] >= max) {
                max = scores[i];
            }
        }

        double[] newScores = new double[N];
        double sum = 0;
        for(int i=0; i<N; i++) {
            newScores[i] = (double) scores[i]/max * 100;
            sum += newScores[i];
        }

        System.out.printf("%f\n", sum/N);

    }
}