package Eager_way_of_Design;

import Lazy_way_of_Design.SingletonLazyWay;

public class SingletonEagerWay {

    /* Eager way of creating Singleton object */

    private static SingletonEagerWay obj = new SingletonEagerWay();

    private SingletonEagerWay(){}


    public static SingletonEagerWay getInstance()
    {
        return obj;
    }

}
