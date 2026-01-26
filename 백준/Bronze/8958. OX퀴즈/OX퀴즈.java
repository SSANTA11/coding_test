import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            int sum=0;
            int a = 1;
            for (char e: input.toCharArray()){
                if(e=='O'){
                    sum+=a;
                    a+=1;
                }else{
                    a=1;
                }
            }
        System.out.println(sum);
        }
    }
}