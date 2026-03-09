import java.util.Scanner;
public class input_large_num_array{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int max=0;
        int b[]=new int[n];
        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++)
        {
             b[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(max<b[i])
            {
                max=b[i];
            }
        }
        System.out.println("the largesest value is : "+max);
    }
}
