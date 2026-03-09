import java.util.*;
public class Q20_merge_two_sorted_arrays {
    static Scanner sc=new Scanner(System.in);
    public static void merge(int[] a,int[] b,int n,int m)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                int temp=0;
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        
        for(int i=0;i<m-1;i++)
        {
            for(int j=0;j<m-1-i;j++)
            {
                int temp=0;
                if(b[j]>b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;

                }
            }
        }
        
        int k[]=new int[n+m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            k[c++]=a[i];
        }
        for(int i=0;i<m;i++)
        {
            k[c++]=b[i];
        }
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }

    }
    public static void main(String args[])
    {
        System.out.print("Enter the length of the array for A: ");
        int n=sc.nextInt();
        System.out.print("Enter the length of the array for B: ");
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        System.out.println("enter the value for A arrays");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the value for B arrays");
        for(int j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
        }
        merge(a,b,n,m);
      
}
}
