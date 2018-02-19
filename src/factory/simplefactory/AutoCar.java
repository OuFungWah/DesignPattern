package factory.simplefactory;

public class AutoCar implements Car{

    @Override
    public void drive() {
        System.out.println("大众启动...");
    }

    @Override
    public void useGPS() {
        System.out.println("大众使用GPS...");
    }
}
