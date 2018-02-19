package singleton;

import java.util.Random;

public class IoDHSingleton {

    private int randomNum;

    private IoDHSingleton() {
        randomNum = new Random().nextInt(100);
    }

    public static IoDHSingleton getInstance() {
        return InstanceHolder.instance;
    }

    public void show(){
        System.out.println("随机编号为: "+randomNum);
    }

    private static class InstanceHolder {
        //将线程安全问题交给Java虚拟机
        private static final IoDHSingleton instance = new IoDHSingleton();

    }

}
