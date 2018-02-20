package factory.abstractfactory.sony;

import factory.abstractfactory.Tablet;

public class SonyTablet implements Tablet {
    @Override
    public void play() {
        System.out.println("SonyTablet playing...");

    }

    @Override
    public void turnOn() {
        System.out.println("SonyTablet started...");

    }

    @Override
    public void turnOff() {
        System.out.println("SonyTablet started...");

    }
}
