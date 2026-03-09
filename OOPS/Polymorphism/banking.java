class bank{
    void interest()
    {
        System.out.println("bank having interest");
    }
}
class SBI extends bank{
    public void interest()
    {
        System.out.println("SBI bank having 7% interst");
    }
}

class ICIC extends bank{
    protected void interest()
    {
        System.out.println("ICIC habk having 5% interest");
    }
}
public class banking {
    public static void main(String args[])
    {
        bank b1=new SBI();
        b1.interest();

        bank b2=new ICIC();
        b2.interest();

        SBI s1=(SBI)b1;
        s1.interest();
    }
}
