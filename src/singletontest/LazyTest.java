package singletontest;

import singleton.LazySingleton;

public class LazyTest {

    public static void main(String args[]){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        LazySingleton instance3 = LazySingleton.getInstance();
        LazySingleton instance4 = LazySingleton.getInstance();
        instance1.show();
        instance2.show();
        instance3.show();
        instance4.show();
    }

}
