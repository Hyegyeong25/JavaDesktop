package Quiz;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Quiz02 {
    public static void main(String[] args){
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("dept", "데이터분석");
        list.add(map);
        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("dept", "정보보안");
        list.add(map);
        map = null;
/*
        System.out.println("=======개선된for문========");
        for(Map<String, String> rMap : list){
            System.out.println("name : "+rMap.get("name"));
            System.out.println("dept : "+rMap.get("dept"));
        }
        System.out.println("=======람다========");
        list.forEach(rMap -> {
            System.out.println("name : "+rMap.get("name"));
            System.out.println("dept : "+rMap.get("dept"));
        });
 */
        System.out.println("list2");
        List<String> list2 = new ArrayList<>();
        list2.add("이협건");
        list2.add("홍길동");
        for(String name : list2) {
            System.out.println(name);
        }
        System.out.println("list3");
        List<String> list3 = new ArrayList<>();
        list3.add("이협건");
        list3.add("홍길동");
        list3.forEach(name->System.out.println(name));
    }
}
