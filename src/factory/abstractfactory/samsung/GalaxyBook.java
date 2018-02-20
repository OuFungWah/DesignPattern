package factory.abstractfactory.samsung;

import factory.abstractfactory.Computer;

public class GalaxyBook implements Computer {

    @Override
    public void Programming(String language) {
        System.out.println("用 Galaxy Book 做"+language+"程序");
    }

    @Override
    public void turnOn() {
        System.out.println("Galaxy Book started...");
    }

    @Override
    public void turnOff() {
        System.out.println("Galaxy Book shut down...");
    }

}
