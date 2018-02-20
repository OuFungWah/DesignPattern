package factory.abstractfactory;

import factory.abstractfactory.computer.Computer;

public interface AbstractFactory {

    Tablet getTablet(String mode);
    SmartPhone getSmartPhone(String mode);
    Computer getComputer(String mode);

}
