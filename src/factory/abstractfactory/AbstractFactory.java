package factory.abstractfactory;

/**
 * 抽象工厂类
 * @author CrazyWah
 */
public interface AbstractFactory {

    /**
     * 生产平板电脑对象
     * @param mode 型号字符串
     * @return Tablet 平板电脑对象
     */
    Tablet getTablet(String mode);

    /**
     * 生产智能手机对象
     * @param mode 型号字符串
     * @return SmartPhone 智能手机对象
     */
    SmartPhone getSmartPhone(String mode);

    /**
     * 生产电脑对象
     * @param mode 型号字符串
     * @return Computer 电脑对象
     */
    Computer getComputer(String mode);

}
