package JavaPPT;

public class Method {
    private String arr = "문자";
    private int num = 0;
    private boolean type = true;

    public static void main(String[] args){
        System.out.println("main 함수 호출 시작!");
        int res = sum(1, 2);
        System.out.println("sum함수 실행 결과 : "+ res);
        System.out.println("main 함수 호출 끝!!");
    }
    public static int sum(int a, int b){
        System.out.println("sum 함수 호출 시작!!");
        int sum = 0;
        for (int i = a; i < b+1; i++) {
            sum += i;
        }
        return sum;
    }
}
