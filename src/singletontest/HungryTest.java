package singletontest;

import singleton.HungrySingleton;

public class HungryTest {

    public static void main(String args[]){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        HungrySingleton instance3 = HungrySingleton.getInstance();
        HungrySingleton instance4 = HungrySingleton.getInstance();
        instance1.show();
        instance2.show();
        instance3.show();
        instance4.show();
    }

}
