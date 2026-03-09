class register{
    String name;
    String pwd;
    long phno;
    String email;

    register()
    {
    }
    register(String name,long phno, String pwd)
    {
        this.name=name;
        this.phno=phno;
        this.pwd=pwd;
    }
    register(String name,String pwd, String email)
    {
        this.name=name;
        this.pwd=pwd;
        this.email=email;
    }
    void display()
    {
        System.out.println("hello");
    }
}
public class constructor_overloading {
    public static void main(String args[])
    {
        register r1=new register();
        r1.display();
        System.out.println("-----------------------------------");
        register r2=new register("dinga",1234567L,"i@lovedingi");
        r2.display();
        System.out.println("--------------------------------------");
        register r3=new register("srini","i@lovedig","srinivasan2113@gmail.com");
        r3.display();
    }
}
