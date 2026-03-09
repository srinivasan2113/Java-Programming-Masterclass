import java.util.Scanner;

public class Q4_count_occurrences_of_element {
     static Scanner sc=new Scanner(System.in);
    public static int binary(int[]a,int n,int k)
    {
        int lowr=0;
        int highr=n-1;
        int lowl=0;
        int highl=n-1;
        int count=-1;
        while(lowr<=highr)
        {
            int mid=lowr+(highr-lowr)/2;
            if(a[mid]==k)
            {
                count++;
                highr=mid-1;
                   
            }
            else if(a[mid]<k)
            {
                lowr=mid+1;
            }
            else
            {
                highr=mid-1;
            }
        }
         while(lowl<=highl)
        {
            int mid=lowl+(highl-lowl)/2;
            if(a[mid]==k)
            {
                count++;
                lowl=mid+1;
                   
            }
            else if(a[mid]<k)
            {
                lowl=mid+1;
            }
            else
            {
                highl=mid-1;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the sorted array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("enter the value to search: ");
        int k=sc.nextInt();
        int index=binary(a,n,k);
        if(index!=-1)
        {
            System.out.println("the binary search of the index for"+index);
        }
        else{
            System.out.println("we can't find the index");
        }
    }
    
}
