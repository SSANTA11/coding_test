import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int i4 = sc.nextInt();
        int i5 = sc.nextInt();
        int i6 = sc.nextInt();
        int i7 = sc.nextInt();
        int i8 = sc.nextInt();
//        "ascending", "descending", "mixed"
        String p="mixed";
        int[] input = {i1, i2, i3, i4, i5, i6, i7, i8};
       for (int i = 0;i<8;i++){
           if(i1==1){
               if(input[i]!=i+1){
                   break;
               }
               if(i==7&&i8==8){
                   p="ascending";
               }
           }else if(i1==8){
               if(input[i]!=8-i){
                   break;
               }
               if(i==7&&i8==1){
                   p="descending";
               }
           }
       }
       System.out.println(p);
    }
}