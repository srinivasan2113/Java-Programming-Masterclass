package company;

public class manager extends employee {
    double bonus;
    int MID;
    String address;

manager(int eid,String ename,double salary,String companyname,double bonus,int MID,String address)
{
    super(eid,ename,salary,companyname);
    this.bonus=bonus;
    this.MID=MID;
    this.address=address;
}

void displaymanager()
{
    System.out.println("eid: "+eid);
    System.out.println("ename: "+ename);
    System.out.println("salary: "+salary);
    System.out.println("company name: "+companyname);
    System.out.println("bonus: "+bonus);
    System.out.println("MID: "+MID);
    System.out.println("address: "+address);
}
    
}
  