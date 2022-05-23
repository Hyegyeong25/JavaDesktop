import java.util.Scanner;

public class Ex0523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = scan.nextLine();

        strRep = str.replace(" ", "$");
        strSub = str.substring(3, 8);
        strAry = str.split(" ");

        System.out.println(strRep);
        System.out.println(strSub);

        for (int i = 0; i < strAry.length; i++) {
            System.out.println(strAry[i]);
        }
    }
}
