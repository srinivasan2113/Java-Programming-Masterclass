import java.util.Scanner;
public class GCD {
    static Scanner sc=new Scanner(System.in);
    public static int greatest(int gcdA, int gcdB)
    {
        int max=(gcdA>gcdB)?gcdA:gcdB;
        while(true)
        {
            if(max % gcdA==0 && max % gcdB==0 )
            {
                return max;

            }
            max++;
        }
    }
       
    public static void main(String args[])
    {
        System.out.print("enter your value:");
        int gcdA=sc.nextInt();
        System.out.print("enter your value");
        int gcdB=sc.nextInt();
        int ans=greatest(gcdA,gcdB);
        System.out.println(ans);
    }
    
}
