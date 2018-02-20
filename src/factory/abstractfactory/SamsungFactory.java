package factory.abstractfactory;

import factory.abstractfactory.computer.Computer;

public class SamsungFactory implements AbstractFactory {
    @Override
    public Tablet getTablet(String mode) {
        Tablet tablet = null;
        if(mode.equals("GALAXY TAB S3")){

        }else if (mode.equals("GALAXY TAB A")){

        }else if (mode.equals("GALAXY TAB E")){

        }
        return tablet;
    }

    @Override
    public SmartPhone getSmartPhone(String mode) {
        SmartPhone smartPhone = null;
        if(mode.equals("GALAXY TAB S3")){

        }else if (mode.equals("GALAXY TAB A")){

        }else if (mode.equals("GALAXY TAB E")){

        }
        return smartPhone;
    }

    @Override
    public Computer getComputer(String mode) {
        Computer computer = null;
        if(mode.equals("GALAXY TAB S3")){

        }else if (mode.equals("GALAXY TAB A")){

        }else if (mode.equals("GALAXY TAB E")){

        }
        return computer;
    }
}
