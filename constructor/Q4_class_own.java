public class Q4_class_own
{
    String name;
    int age;
    int rollno;
    float mark;
    long phno;
    String subject;


    Q4_class_own(String sname,int Age,int id,float score,long tel,String sub )
    {
        name=sname;
        age=Age;
        rollno=id;
        mark=score;
        phno=tel;
        subject=sub;
    }
    void display()
    {
        System.out.println("the name of the student is: "+name);
        System.out.println("the name of the student is: "+age);
        System.out.println("the name of the student is: "+rollno);
        System.out.println("the name of the student is: "+mark);
        System.out.println("the name of the student is: "+phno);
        System.out.println("the name of the student is:  "+subject);

    }
    public static void main(String args[])
    {
        Q4_class_own S1=new Q4_class_own("srini",21,17,323.5f,6374056261L,"java");
        S1.display();
    }
}