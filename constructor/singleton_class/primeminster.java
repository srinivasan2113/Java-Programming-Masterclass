package singleton_class;

public class primeminster {
    String pmName="modi";
    //step 2: create one reference variable
    public static primeminster pm;


    //step 1: make the constructor private
    private primeminster()
    {
        System.out.println("prime minister of india");
    }

    //step 3: create one public class type method
    public static primeminster getPm()
    {
        if(pm==null)
        {
            pm =new primeminster();
        }
        return pm;
    }
    
}
