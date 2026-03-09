package company;

public class company {
    public static void main(String[] args) {
        developer d1=new developer(101,"srini",50000,"skysparknova","projectX",9999);
        d1.displaydev();
        System.out.println("____________________________________________________________");
        manager m1=new manager(102,"vasan",100000,"skysparknova",5000,102,"pondicherry");
        m1.displaymanager();
        System.out.println("____________________________________________________________");
        m1.displayemp();

    }
}
