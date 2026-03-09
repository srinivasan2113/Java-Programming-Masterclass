//Create a class Student with a parameterized constructor that accepts name and marks.
//The constructor should calculate grade:

//Marks ≥ 90 → A

//Marks ≥ 75 → B

//Marks ≥ 50 → C

//Marks < 50 → F


public class Q6_student_grad {
    String sname;
    float marks;
    char grade;   

    Q6_student_grad(String name,float score){
        sname=name;
        marks=score;
        
        if(marks>=90)
        {
            grade='A';
        }
        else if(marks>=75 && marks<90)
        {
            grade='B';
        }
        else if(marks>=50 && marks<75){
            grade='c';
        }
        else
        {
            grade='F';
        }
    }

    void display()
    {
        System.out.println("__________INPUT___________");
        System.out.println("Name:"+sname);
        System.out.println("Marks:"+marks);


        System.out.println("__________OUTPUT___________");
        System.out.println("Name: "+sname);
        System.out.println("Marks: "+marks);
        System.out.println("grade: "+grade);

    }

    public static void main(String args[])
    {
        Q6_student_grad S1=new Q6_student_grad("srini",95);
        S1.display();
    }

}
