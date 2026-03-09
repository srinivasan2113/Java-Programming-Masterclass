import java.util.Scanner;
public class Armstrong {
    static Scanner sc=new Scanner(System.in);
    public static int arm(int arms)
    {
        int armstrong=arms;
        int power=0;
        
        int add=0;
        while(arms>0)
        {
             power++;
             arms=arms/10;

        }
        while(armstrong>0)
        {
            int last=armstrong%10;
            int ans=1;
            for(int i=1;i<=power;i++)
            {
                ans=ans*last;
            }
            add=ans+add;
            armstrong=armstrong/10;

        }
        return add;
    }
public static void main(String args [])
{
    System.out.print("Enter your number to check : ");
    int arms=sc.nextInt();
    int ans=arm(arms);
    System.out.println(ans);
}
}
    

