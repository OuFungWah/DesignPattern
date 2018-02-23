package factory.abstractfactory;

import factory.abstractfactory.Product;

/**
 * @author CrazyWah
 * 电脑抽象类
 */
public interface Computer extends Product {

    /**
     * 使用电脑编程
     * @param language 对应的编程语言的String
     */
    void Programming(String language);

}
