import java.util.Scanner;

public class Ex1615 {
    public static int selfChk(int n){
        int result = n;
        while(true) {
            int one = n % 10;
            if(n > 9) n = n / 10;
            else n = 0;
            result += one;
            if(n == 0) break;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean[] chk = new boolean[5001];

        for (int i = 1; i <= b; i++) {
            int result = selfChk(i);
            if(result <=  5000) chk[result] = true; //셀프넘버에서 제외
        }
        int hap = 0;
        for (int i = a; i <= b; i++) {
            if(chk[i]==false)
            {
                hap += i;
            }
        }
        System.out.println(hap);
    }
}
