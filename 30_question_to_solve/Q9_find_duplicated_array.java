import java.util.Scanner;

public class Q9_find_duplicated_array {
        static Scanner sc=new Scanner(System.in);
    public static void dup(int[] a,int n)
    {
        boolean duplicated=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    duplicated=true;
                    break;
                   
                }
            }
                if(duplicated)
                {
                    break;

                }
            }
                if(duplicated)
                {
                    System.out.println("the give array is duplicated : ");

                }
                else
                {
                    System.out.println("the give array is not duplicated");
                }


              
            
    }
    public static void main(String args[])
    {
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the value of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        dup(a,n);
    }
}

    

