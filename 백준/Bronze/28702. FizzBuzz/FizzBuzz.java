import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String i1 = br.readLine();
        String i2 = br.readLine();
        String i3 = br.readLine();
        String[] l = new String[]{i1, i2, i3};
        int i = 0;
        int num = 0;
        for (String e : l) {
            i++;
            if (!e.equals("Fizz") && !e.equals("Buzz") && !e.equals("FizzBuzz")) {
                num = Integer.parseInt(e);
                break;
            }
        }
        if (i == 3) {
            num += 1;
        } else if (i == 2) {
            num += 2;
        } else if (i == 1) {
            num += 3;
        }
        if (num % 5 == 0 || num % 3 == 0) {
            if (num % 5 != 0) {
                System.out.print("Fizz");
            } else if (num % 3 != 0) {
                System.out.print("Buzz");

            } else {
                System.out.print("FizzBuzz");

            }
        } else {
            System.out.print(num);
        }
    }
}