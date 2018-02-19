package factory.simplefactory;

public class SuzukiCar implements Car {
    @Override
    public void drive() {
        System.out.println("铃木启动...");
    }

    @Override
    public void useGPS() {
        System.out.println("铃木使用GPS...");
    }
}
