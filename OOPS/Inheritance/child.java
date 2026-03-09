package OOPS.Inheritance;

public class child extends parent {
    String phName="iphone";
    public static void main(String[] args) {
        child c1 = new child();
        System.out.println(c1.phName);
        System.out.println(c1.bike);

        parent p1=new parent();
        System.out.println(p1.balance);
        System.out.println(p1.phName);
    }
    
}
