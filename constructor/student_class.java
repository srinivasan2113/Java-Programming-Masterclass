public class student_class {
    String name;
    int age;
    double marks;

    student_class(){
        this("unknown",0,0.0);
    }

    student_class(String name)
    {
        this(name,0,0.0);

    }

    student_class(String name,int age)
    {
        this(name,age,0.0);
    }
    student_class(String name,int age,double marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    void display()
    {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("--------------------");

    }
    public static void main(String args[])
    {
        student_class s1 = new student_class();
        student_class s2 = new student_class("srini");
        student_class s3 = new student_class("srini",20);
        student_class s4 = new student_class("Srini",20,95.5);

        s1.display();
        s2.display();
        s3.display();
        s4.display();

    }
}
