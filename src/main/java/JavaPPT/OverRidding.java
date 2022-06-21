package JavaPPT;

import java.util.Date;

public class OverRidding extends OverRiddingTest{
    @Override
    public void testPrint(){
        Date today = new Date();
        System.out.println("name : "+getName()+", color :"+getColor());
        System.out.println("Today : "+today);
    }

    public static void main(String[] args) {
        OverRidding over = new OverRidding();
        over.setName("사과");
        over.setColor("빨강");

        over.testPrint();
    }
}
