import java.util.Scanner;
public class Q3_ind_last_occurrence_of_element {
    static Scanner sc=new Scanner(System.in);
    public static int binary(int[]a,int n,int k)
    {
        int low=0;
        int high=n-1;
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==k)
            {
                result=mid;
                low=mid+1;
            }
            else if(a[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return result;
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
