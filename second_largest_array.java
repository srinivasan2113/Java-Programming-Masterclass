import java.util.*;
public class second_largest_array
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int lar=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        System.out.print("enter your length of the array:");
        int n=sc.nextInt();
        int b[]=new int[n];
        System.out.print("enter your array value till "+n+" :");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            
            if(lar<b[i])
            {
                second=lar;
                lar=b[i];
            }
           else if(lar<b[i]&& b[i]!=lar)
            {
                second=b[i];
            }
        }
        System.out.println("the second large value is:"+second);
        
    }
}

