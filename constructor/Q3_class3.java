public class Q3_class3 {
    String ename;
    int eid;
    String designation;
    String doj;
    double salary;

    Q3_class3()
    {
        ename="srini";
        eid=2550;
        designation="java developer";
        doj="13-03-2026";
        salary=50000;
    }

    void display()
    {
        System.out.println("employee name is:"+ename);
        System.out.println("employee eid is:"+eid);
        System.out.println("employee designation is:"+designation);
        System.out.println("employee doj is:"+doj);
        System.out.println("employee salary is:"+salary);

        

    }
       public  static void main(String[ ] args)
       {
        Q3_class3 ob1=new Q3_class3();
        ob1.display(); 
        
       }
}
