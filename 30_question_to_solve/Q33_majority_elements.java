import java.util.Scanner;
public class Q33_majority_elements {
    static Scanner sc=new Scanner(System.in);
    public static void maj(int[] a,int n)
    {
        int mid=n/2;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                
                if(a[j]==a[i])
                {
                    count++;
                }
            }
            if(count>mid)
            {
                System.out.println("the majority value is: "+a[i]);
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
        maj(a,n);


        System.out.println("the sorred array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
