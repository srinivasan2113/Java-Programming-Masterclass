package singleton_class;

public class Singleton {
    public static Singleton single1;
    private Singleton()
    {
        System.out.println("hi, how are you");
    }

    public static Singleton getInstance()
    {
        if(single1 == null)
        {
            single1=new Singleton();

            return single1; 
        }
    }
}
