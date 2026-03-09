import java.util.*;
public class Q10_max_count_1_array {
    static Scanner sc=new Scanner(System.in);
    public static void max(int[] a,int n)
    {
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)            //eg 1011001111
        {
            if(a[i]==1)
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
               
            
            }
             else{
                    count=0;
                }
            
        }
        System.out.println("the max of 1 is : "+max);


    }
    public static void main(String args[])
    {
        System.out.print("enter the lenght of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max(a,n);
    }
    
}
