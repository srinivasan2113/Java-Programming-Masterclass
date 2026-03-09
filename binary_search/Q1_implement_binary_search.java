import java.util.Scanner;
public class Q1_implement_binary_search {
    static Scanner sc =new Scanner(System.in);
    public static int binary(int[]a ,int n,int k)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(a[mid]==k)
            {
                return mid;
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
        return -1;

    }
    public static void main (String args[])
    {
        System.out.print("enter the length og th array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.print("enter the value to search: ");
        int k=sc.nextInt();
        int index=binary(a,n,k);

        if (index !=-1) {
            System.out.println("element_found_at_index: " + index);
        } else {
            System.out.println("element_not_found");
        }
    }
}
