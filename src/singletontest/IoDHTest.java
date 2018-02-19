package singletontest;

import singleton.IoDHSingleton;

public class IoDHTest {

    public static void main(String args[]){
        IoDHSingleton instance1 = IoDHSingleton.getInstance();
        IoDHSingleton instance2 = IoDHSingleton.getInstance();
        IoDHSingleton instance3 = IoDHSingleton.getInstance();
        IoDHSingleton instance4 = IoDHSingleton.getInstance();
        instance1.show();
        instance2.show();
        instance3.show();
        instance4.show();
    }

}
