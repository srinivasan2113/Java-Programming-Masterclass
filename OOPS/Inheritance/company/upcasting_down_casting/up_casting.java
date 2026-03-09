package company.upcasting_down_casting;

public class up_casting {
    public static void main(String[] args) {
        child ch=new child();
        ch.play();
        ch.display();
        System.out.println("-------upcasting---------");
        parent p1=ch;
        p1.display();
        //p1.play();  it will not working because it was (upcasting)


        System.out.println("---------downcasting--------");
        child ch2=(child)p1;
        ch2.play();
        ch2.display();

    }
    
}
