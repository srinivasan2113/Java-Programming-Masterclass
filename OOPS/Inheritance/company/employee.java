
package company;
class employee {
    int eid;
    String ename;
    double salary;
    String companyname;
    double annualsalary;

    employee(int eid,String ename,double salary,String companyname)
    {
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
        this.companyname=companyname;
    }
    


void annualsalary()
{
    annualsalary=salary*12;
    System.out.println("the annualsalary of the employess is: "+annualsalary);
    
}
void displayemp()
{
    System.out.println("eid: "+eid);
    System.out.println("ename: "+ename); 
    System.out.println("salary: "+salary);
    System.out.println("company name: "+companyname);
    this.annualsalary();
    
}
}
