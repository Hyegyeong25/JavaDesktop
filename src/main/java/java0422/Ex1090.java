package java0422;

import java.util.Scanner;

public class Ex1090 {
    //codeup 등비수열
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();
        int i = 1;
        long result = a;

        //while
        while(true) {
            if(i == n) break;
            i++;
            result = result * r;
        }
        System.out.println(result);

        //초기화
        i = 1; result = a;

        //for
        for(i = 1; i < n; i++){
            result = result * r;
        }
        System.out.println(result);
    }
}
