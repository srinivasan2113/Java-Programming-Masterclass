public class constructor_this_example {
    String name;
    String gfname;

    constructor_this_example(String name,String gfname)
    {
        this.name=name;
        this.gfname=gfname;
    }
    void wish()
    {
        System.out.println("happy valentine's day");
        this.display();
    }
    void display()
    {
        System.out.println("my name is: "+name);
        System.out.println("my gf name is: "+gfname);
    }

    public static void main(String[] args)
    {
        constructor_this_example ab1=new constructor_this_example("dinga", "dingi");
        ab1.wish();
    }
}
