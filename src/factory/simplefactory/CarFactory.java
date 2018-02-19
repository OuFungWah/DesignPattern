package factory.simplefactory;

public class CarFactory {

    public CarFactory(){

    }

    public static Car getCar(String brand){
        Car car = null;
        if(brand.equals("BMW")){
            car = new BMWCar();
        }else if (brand.equals("Auto")){
            car = new AutoCar();
        }else if (brand.equals("Suzuki")){
            car = new SuzukiCar();
        }
        return car;
    }

}
