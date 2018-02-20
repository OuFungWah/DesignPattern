package factory.abstractfactory.samsung;

import factory.abstractfactory.SmartPhone;

public class GalaxyS8 implements SmartPhone {
    @Override
    public void call() {
        System.out.println("Samsung Galaxy 打电话");
    }

    @Override
    public void send() {
        System.out.println("Samsung Galaxy 发短信");
    }

    @Override
    public void turnOn() {
        System.out.println("GalaxyS8 started...");
    }

    @Override
    public void turnOff() {
        System.out.println("GalaxyS8 shut down...");
    }
}
