//Class Employee takes name, salary, yearsOfService.
//If yearsOfService > 5, add 10% bonus to salary. Show final salary.




public class Q9_bonous_calculation {
    String name;
    double salary;
    int yearsofservice;
    double newsalary;

    Q9_bonous_calculation(String nam,int sal,int ser)

    {
        name=nam;
        salary=sal;
        yearsofservice=ser;
    }

    void display()
    {
        System.out.print("name="+name+", salary=");
        if(yearsofservice>5)
        {
            newsalary=salary*1.1;
            System.out.println(newsalary);
        }
        else{
            System.out.println(salary);
        }
    }

    public static void main(String args[])
    {
        Q9_bonous_calculation B1=new Q9_bonous_calculation("srini",40000,6);
        B1.display();
    }
}
