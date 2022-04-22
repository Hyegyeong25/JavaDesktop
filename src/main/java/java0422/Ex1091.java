package java0422;

import java.util.Scanner;

public class Ex1091 {
    // 수열 3번째 문제
    // 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();
        int i = 1;
        long result = a;

        //while 풀이
        while(true){
            if(i == n) break;
            i++;
            result = (result*m)+d;
        }
        System.out.println(result);

        //초기화
        i = 1; result = a;

        //for 풀이
        for(i = 1; i < n; i++){
            result = (result*m)+d;
        }
        System.out.println(result);
    }
}
