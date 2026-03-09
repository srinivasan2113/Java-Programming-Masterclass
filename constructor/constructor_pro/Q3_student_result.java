package constructor_pro;

public class Q3_student_result {
    String name;
    int marks;
    float average;
    String result;
    int s1;
    int s2;
    int s3;

Q3_student_result(String n,int m1,int m2,int m3)
{
    name=n;
    marks=m1+m2+m3;
    s1=m1;
    s2=m2;
    s3=m3;
}

void display()
{
    average=marks/3.0f;
    System.out.println("Name            : "+name);
    System.out.println("Total Marks     : "+marks);
    System.out.println("Average         : "+average);

    if(s1>=35&&s2>=35&&s3>=35)
    {
        if(average>=50 && average<90)
        {
            result="pass";
        }
        else if(average>=90)
        {
            result="Distinction";
        }
        else{
            result="fail";
        }
    }
    else{
        result="fail";
    }
    System.out.println("Result         : "+result);
}

public static void main(String args[])
{
    Q3_student_result s1=new Q3_student_result("Maya",80,95,88);
    s1.display();
}
}
