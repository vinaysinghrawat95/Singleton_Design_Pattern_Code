package Lazy_way_of_Design;

public class Main
{
    public static void main(String[] args)
    {
       Test t1 = Test.getInstance();
       System.out.println(t1);

        Test t2 = Test.getInstance();
        System.out.println(t2);

        if(t1 == t2)
        {
            System.out.println("Both objects are same");
        }
        else
        {
            System.out.println("Both objects are different");
        }
    }
}