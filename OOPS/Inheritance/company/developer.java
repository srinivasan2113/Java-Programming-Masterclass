package company;

class developer extends employee {
    String projectname;
    int projectID;

developer(int eid,String ename,double salary,String companyname,String projectname,int projectID)
{
    super(eid,ename,salary,companyname);
    this.projectname=projectname;
    this.projectID=projectID;
}

void displaydev()
{
    System.out.println("eid: "+eid);
    System.out.println("ename: "+ename);
    System.out.println("salary: "+salary);
    System.out.println("companyname: "+companyname);
    System.out.println("projectname: "+projectname);
    System.out.println("projectID: "+projectID);

}
}
