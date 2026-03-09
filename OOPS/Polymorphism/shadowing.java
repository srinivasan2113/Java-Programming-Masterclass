class fruits{
    public static void name(){
        System.out.println("apple");
    }
}

class mango extends fruits{
    public static void name(){
        System.out.println("mango");
    }
}

public class shadowing {
    public static void main(String args[])
    {
        fruits.name();
        mango.name();
        mango f1=new mango();
        f1.name();
    }
}
