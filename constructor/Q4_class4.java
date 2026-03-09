public class Q4_class4 {
    String sname;
    int rollno;
    long phNo;
    int marks;
    String subject;

    
Q4_class4(String name,int id,long tel,int score,String sub)
{
    sname=name;
    rollno=id;
    phNo=tel;
    marks=score;
    subject=sub;
}
void display()
{
    System.out.println("student name is:"+sname);
    System.out.println("student id is:"+rollno);
    System.out.println("student phno. is:"+phNo);
    System.out.println("student marks is:"+marks);
    System.out.println("student subject is:"+subject);
}
public static void main(String[] args){
    Q4_class4 s1=new Q4_class4("srini",45,12345,100,"java");
    s1.display();

    Q4_class4 s2=new Q4_class4("vasan",18,98765,93,"sql");
    s2.display();
}
}
