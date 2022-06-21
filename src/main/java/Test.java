public class Test {
    public static void main(String[] args) {
        /*String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";
        //아이피 구하려면? 맨 앞에 있으면서 띄어쓰기 전에 있는 숫자
        //1
        int lastIndex = log.indexOf(" ");
        String str = log.substring(0, lastIndex);
        System.out.println(str);

        //2
        String[] item = log.split(" ");
        System.out.println(item[0]);

        String time = item[3].substring(1);
        System.out.println(time);*/
        Car car1 = new Car();
        car1.upSpeed(150);
        car1.downSpeed(50);
        System.out.println(car1.getSpeed());

        Sedan s = new Sedan();
        s.seatnum = 5;
        s.setSeatnum(6);
        System.out.println(s.getSeatnum());

        Truck T = new Truck();
        
        T.Dance();

    }
}





class Car {
    private int speed = 0;

    void upSpeed(int s){
        speed += s;
    }

    void downSpeed(int value){
        speed -= value;
    }

    int getSpeed(){
        return speed;
    }
}




class Sedan extends Car {

    public int seatnum;

    void setSeatnum(int seatnum){
        this.seatnum = seatnum;
    }
    int getSeatnum(){
        return seatnum;
    }
}














class Truck extends Car {
    String color = "Orange";

    void Dance() {
        String d = "춤을 춘다";
    }
}