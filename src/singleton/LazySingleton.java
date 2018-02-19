package singleton;

import java.util.Random;

public class LazySingleton {

    private static LazySingleton instance = null;
    private int randomNum;

    private LazySingleton(){
        randomNum = new Random().nextInt(100);
    }

    public static LazySingleton getInstance() {
        if(instance==null){
            //同步锁，以免多线程造成的多次创建
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("随机编号为: "+randomNum);
    }

}

