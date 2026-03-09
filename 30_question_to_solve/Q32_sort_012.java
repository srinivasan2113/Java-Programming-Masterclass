import java.util.Scanner;
public class Q32_sort_012 {
    static Scanner sc=new Scanner(System.in);
    public static void sort123(int[]a,int n)
    {
       int low=0,mid=0,height=n-1;
       while(mid<=height)
       {
        if(a[mid]==0)
        {
            int temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            mid++;
            low++;
        }
        else if(a[mid]==1)
        {
            mid++;
        }
        else
        {
            int temp=a[mid];
            a[mid]=a[height];
            a[height]=temp;
            height--;
        }
       }
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
        sort123(a,n);


        System.out.println("the sorred array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
