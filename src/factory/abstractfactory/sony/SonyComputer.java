package factory.abstractfactory.sony;

import factory.abstractfactory.Computer;

public class SonyComputer implements Computer{

    @Override
    public void Programming(String language) {
        System.out.println("SonyComputer 用"+language+"编程");
    }

    @Override
    public void turnOn() {
        System.out.println("SonyComputer started...");

    }

    @Override
    public void turnOff() {
        System.out.println("SonyComputer started...");

    }
}
