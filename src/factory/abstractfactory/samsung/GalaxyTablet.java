package factory.abstractfactory.samsung;

import factory.abstractfactory.Tablet;

public class GalaxyTablet implements Tablet {
    @Override
    public void play() {
        System.out.println("GalaxyTablet play...");
    }

    @Override
    public void turnOn() {
        System.out.println("GalaxyTablet started...");
    }

    @Override
    public void turnOff() {
        System.out.println("GalaxyTablet started...");
    }
}
