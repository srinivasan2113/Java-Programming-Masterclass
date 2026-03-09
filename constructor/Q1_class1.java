public class Q1_class1 {
    int a;
    Q1_class1(){
        a=50;
        System.out.println("i am non parameteried constructor");

    }
    public static void main(String[] args)
    {
        Q1_class1 obj1=new Q1_class1();
        System.out.print(obj1.a);
    }
    
}
