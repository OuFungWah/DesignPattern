package factory.abstractfactory.samsung;

import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.Computer;
import factory.abstractfactory.SmartPhone;
import factory.abstractfactory.Tablet;

public class SamsungFactory implements AbstractFactory {

    private SamsungFactory(){

    }

    private static class InstanceHolder{
        private static final SamsungFactory factory = new SamsungFactory();
    }

    @Override
    public Tablet getTablet(String mode) {
        Tablet tablet = null;
        tablet = new GalaxyTablet();
        return tablet;
    }

    @Override
    public SmartPhone getSmartPhone(String mode) {
        SmartPhone smartPhone = null;
        smartPhone = new GalaxyS8();
        return smartPhone;
    }

    @Override
    public Computer getComputer(String mode) {
        Computer computer = null;
        computer = new GalaxyBook();
        return computer;
    }

    public static SamsungFactory getInstance(){
        return InstanceHolder.factory;
    }

}
