package Quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz01 {
    public static void main(String[] args) {
        List<String> pList = new ArrayList<>();
        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

        for (String name : pList) {
            System.out.println(name);
        }
    }
}
