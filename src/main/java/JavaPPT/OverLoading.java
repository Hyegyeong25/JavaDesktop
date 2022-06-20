package JavaPPT;

public class OverLoading {
    public static int sum(int a, int b){
        return sum(a, b, 0, 0); //파라미터 4개짜리 함수 sum 실행
    }
    public static int sum(int a, int b, int c){
        return sum(a, b, c, 0); //파라미터 4개짜리 함수 sum 실행
    }
    public static int sum(int a, int b, int c, int d){
        int res = a+b+c+d;
        return res;
    }
}
