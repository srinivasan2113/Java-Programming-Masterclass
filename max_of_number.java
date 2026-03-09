import java.util.Scanner;
public class max_of_number {
    static Scanner sc=new Scanner(System.in);
    public static int maximum( int max)
    {   int a=0;
        while(max>0)
        {
            int last=max%10;
            
            if(a<last)
            {
                a=last;
            }
            max=max/10;
        }
        return a;

    }
    public static void main(String args[])
    {
        System.out.print("enter your value to enter: ");
        int max=sc.nextInt();
        int ans=maximum(max);
        System.out.println(ans);
    }
    
}
