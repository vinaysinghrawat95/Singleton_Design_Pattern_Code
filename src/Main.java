import Eager_way_of_Design.SingletonEagerWay;
import Lazy_way_of_Design.SingletonLazyWay;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\t Lazy way of creating Singleton object ");
       SingletonLazyWay t1 = SingletonLazyWay.getInstance();
       System.out.println(t1.hashCode());

        SingletonLazyWay t2 = SingletonLazyWay.getInstance();
        System.out.println(t2.hashCode());

        if(t1 == t2)
        {
            System.out.println("Both objects are same");
        }
        else
        {
            System.out.println("Both objects are different");
        }


        System.out.println("\t Eager way of creating Singleton object ");
        SingletonEagerWay obj1 = SingletonEagerWay.getInstance();
        System.out.println(obj1.hashCode());


        SingletonEagerWay obj2 = SingletonEagerWay.getInstance();
        System.out.println(obj2.hashCode());

        if(obj1 == obj2)
        {
            System.out.println("Both objects are same");
        }
        else
        {
            System.out.println("Both objects are different");
        }
    }
}