package JavaPPT;

public class OverRiddingTest {
    private String name;
    private String color;

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void testPrint(){
        System.out.println("name : "+getName()+", color :"+getColor());
    }
}
