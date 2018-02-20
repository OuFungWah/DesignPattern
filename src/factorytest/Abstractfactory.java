package factorytest;

import factory.abstractfactory.samsung.SamsungFactory;

public class Abstractfactory {

    public static void main(String args[]){
        SamsungFactory.getInstance().getComputer(null).Programming("Java");
        SamsungFactory.getInstance().getSmartPhone(null).call();
        SamsungFactory.getInstance().getTablet(null).play();
    }

}
