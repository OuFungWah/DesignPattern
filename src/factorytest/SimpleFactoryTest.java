package factorytest;

import factory.simplefactory.Car;
import factory.simplefactory.CarFactory;

public class SimpleFactoryTest {

    public static void main(String args[]){
        Car bmw = CarFactory.getCar("BMW");
        Car auto = CarFactory.getCar("Auto");
        Car suzuki = CarFactory.getCar("Suzuki");

        bmw.drive();
        bmw.useGPS();

        auto.drive();
        auto.useGPS();

        suzuki.drive();
        suzuki.useGPS();

    }

}
