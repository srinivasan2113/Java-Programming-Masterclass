import java.util.Scanner;
public class Q31_rainwater {
    static Scanner sc=new Scanner(System.in);
    public static void save(int[] a,int n,int[] left,int[] right)
    {
        left[0]=a[0];
        right[n-1]=a[n-1];
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+(Math.min(left[i],right[i])-a[i]);
        }
        System.out.println("the total water we can store is: "+sum);

        

    }
     public static void main(String args[])
    {
        System.out.print("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int left[]=new int[n];
        int right[]=new int[n];

        

        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
            
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(left[i]+" ");
        }

        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
           
        }
        System.out.println();

        for(int i=0;i<n;i++)
        {
            System.out.print(right[i]+" ");
        }
        System.out.println();
        save(a,n,left,right);

    }
    
}
