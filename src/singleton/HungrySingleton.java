package singleton;

import java.util.Random;

public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();
    private int randomNum;

    private HungrySingleton(){
        randomNum = new Random().nextInt(100);
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("我的随机编号为: "+ randomNum);
    }

}
