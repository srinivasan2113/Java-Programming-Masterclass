import java.util.Scanner;

public class Q11_linear_search_index_i {
    static Scanner sc=new Scanner(System.in);
    public static void linear(int[] a,int n,int target)
    {
        boolean found=false;
      for(int i=0;i<n;i++)
      {
        if(a[i]==target)
        {
            System.out.println("the location of the array is: "+i);
            found=true;
            break;

        }
       
      }
       if(!found){
            System.out.println("there is no such value");
        }
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
        System.out.print("Enter the target value in the array: ");
        int target=sc.nextInt();
        linear(a,n,target);
    }
    

    
}
