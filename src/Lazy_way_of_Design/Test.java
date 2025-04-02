package Lazy_way_of_Design;

public class Test
{
    private static Test test;

    //Constructor should be private
    private Test(){}

    /* Lazy way of creating singleton instance */

    public static Test getInstance()
    {
        //Object of this class
        if(test == null)
        {
            test = new Test();
            return test;
        }
        return test;
    }

}

