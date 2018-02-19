package factory.simplefactory;

public class BMWCar implements Car {
    @Override
    public void drive() {
        System.out.println("宝马启动...");
    }

    @Override
    public void useGPS() {
        System.out.println("宝马使用GPS...");
    }
}
