public class constructor_chain {
    int a;
    String b;
    String c;
    char d;
    int e;
    constructor_chain()
    {
        this(10,"hi");
        System.out.println("i am no argument constructor");

    }

    constructor_chain(int a,String b)
    {
        this("bye",'@',100);
        System.out.println("i have 2 parameter");
    }
    constructor_chain(String c,char d,int e)
    {
        System.out.println("i have3 paramenter");
    }           
    public static void main(String[] args) {
        constructor_chain b1=new constructor_chain();
        System.out.println("_----------------------------------------------_");
        constructor_chain b2=new constructor_chain(100,"hello");

    }


}
