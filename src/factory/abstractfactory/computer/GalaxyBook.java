package factory.abstractfactory.computer;

public class GalaxyBook implements Computer {

    @Override
    public void Programming(String language) {
        System.out.println("用 Galaxy Book 做"+language+"程序");
    }

    @Override
    public void turnOn() {
        System.out.println();
    }

    @Override
    public void turnOff() {

    }

}
