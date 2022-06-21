package JavaPPT;

public class carTest {
    public static void main(String[] args) {
        //인스턴스
        Car car = new Car();
        
        //메소드 호출
        car.upSpeed(30);
        car.upSpeed(70);
        car.downSpeed(50);
        car.printSpeed();
    }
}
