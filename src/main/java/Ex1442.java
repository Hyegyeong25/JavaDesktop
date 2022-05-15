import java.util.Scanner;

public class Ex1442 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int min, temp;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[min] ){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
