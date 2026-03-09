import java.util.Scanner;
public class prefect_sqare {
    static Scanner sc=new Scanner(System.in);
    public static boolean square(int S)
    {
        for(int i=1;i<=S/2;i++)
        {
            if(i*i==S)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String args[])
    {
        System.out.print("Enter your value to check:");
        int S=sc.nextInt();
        boolean ans= square(S);
        System.out.println(ans);
    }
    
}
