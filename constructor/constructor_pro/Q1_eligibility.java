package constructor_pro;

public class Q1_eligibility {
  String name;
  int age;  
  int salary;
  int creditscore;

  Q1_eligibility(String n,int a,int s,int c)
  {
    name=n;
    age=a;
    salary=s;
    creditscore=c;
  }
  void display()
  {
    System.out.println("Customer Name :"+name);
    System.out.print("Eligibility: ");
    if(age>=21 && salary>=25000 && creditscore>=700)
    {
        System.out.println("Eligible");
    }
    else{
        System.out.println("Not Eligible");
    }
  }
  public static void main(String args[])
  {
    Q1_eligibility p1=new Q1_eligibility("Arjun",25,30000,680);
    p1.display();
  }
}
