import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        int m = 1;
        int i = 0;
        int sum = 0;
        for (char e : nums.toCharArray()) {
            i++;
            if (e != '*') {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(String.valueOf(e)) * 3;
                } else {
                    sum += Integer.parseInt(String.valueOf(e));
                }
            } else {
                m = i % 2 == 0 ? 3 : 1;
            }
        }

        for (int j = 0; j < 10; j++) {
            if ((sum + j * m) % 10 == 0) {
                System.out.println(j);
                break;
            }
        }
    }
}