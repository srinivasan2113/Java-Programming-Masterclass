package OOPS.Encapsulation.student_bank;

public class main {

    
    public static void main(String[] args) {
        studentAccount s1=new studentAccount("SBI0006050","srini",5000,"rajiv gandhi college of engineering and technology");
        s1.deposit(5000);
        s1.withdraw(2000);
        s1.display();
        studentAccount s2=new studentAccount("SBI0006051","saran",500,"rajiv gandhi college of engineering and technology");
        s2.deposit(50500);
        s2.withdraw(20020);
        s2.display();
    }
}
