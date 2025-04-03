package Lazy_way_of_Design;

public class SingletonLazyWay
{
    private static SingletonLazyWay singletonLazyWay;

    //Constructor should be private
    private SingletonLazyWay(){}

    /* Lazy way of creating singleton instance */

    public static SingletonLazyWay getInstance()
    {
        //Object of this class
        if(singletonLazyWay == null)
        {
            synchronized (SingletonLazyWay.class)
            {
                singletonLazyWay = new SingletonLazyWay();
            }
        }
        return singletonLazyWay;
    }

}

