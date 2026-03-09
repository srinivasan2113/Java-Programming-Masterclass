package reference_variable;

public class Jspider {
    public static void main(String[] args) {
        Qspider j1=new Qspider();
        Qspider j2=new Qspider();
        System.out.println("j1 address:"+j1);
        System.out.println("j2 address:"+j2);

        Qspider j3=j2;
        Qspider j4=j3;
        Qspider j5=j4;

        System.out.println("j3 address: "+j3);
        System.out.println("j3 address: "+j4);
        System.out.println("j3 address: "+j5);
        

    }
}
