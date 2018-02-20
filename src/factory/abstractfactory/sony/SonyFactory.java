package factory.abstractfactory.sony;

import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.Computer;
import factory.abstractfactory.SmartPhone;
import factory.abstractfactory.Tablet;
import factory.abstractfactory.samsung.GalaxyBook;

public class SonyFactory implements AbstractFactory {

    private SonyFactory(){

    }

    private static class InstanceHolder{
        private static final SonyFactory factory = new SonyFactory();
    }

    @Override
    public Tablet getTablet(String mode) {
        Tablet tablet = null;
        tablet = new SonyTablet();
        return tablet;
    }

    @Override
    public SmartPhone getSmartPhone(String mode) {
        SmartPhone smartPhone = null;
        smartPhone = new SonyZ7();
        return smartPhone;
    }

    @Override
    public Computer getComputer(String mode) {
        Computer computer = null;
        computer = new SonyComputer();
        return computer;
    }

    public static SonyFactory getInstance(){
        return InstanceHolder.factory;
    }

}
