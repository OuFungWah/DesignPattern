package factory.simplefactory;

/**
 *  @author CrazyWah
 *  实现 Car 类的大众汽车
 */
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
