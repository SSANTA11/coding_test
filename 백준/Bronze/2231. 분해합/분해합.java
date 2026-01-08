import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum + i == N) {
                System.out.println(i);
                break;
            }
            if (i == N - 1) {
                int n = 0;
                System.out.println(n);

            }
        }
        sc.close();
    }
}