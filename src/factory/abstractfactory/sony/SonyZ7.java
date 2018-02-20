package factory.abstractfactory.sony;

import factory.abstractfactory.SmartPhone;

public class SonyZ7 implements SmartPhone {
    @Override
    public void call() {
        System.out.println("SonyZ7 打电话");

    }

    @Override
    public void send() {
        System.out.println("SonyZ7 发短信");

    }

    @Override
    public void turnOn() {
        System.out.println("SonyZ7 started...");

    }

    @Override
    public void turnOff() {
        System.out.println("SonyZ7 started...");

    }
}
