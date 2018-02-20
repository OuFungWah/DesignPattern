package factory.abstractfactory;

public interface AbstractFactory {

    Tablet getTablet(String mode);
    SmartPhone getSmartPhone(String mode);
    Computer getComputer(String mode);

}
