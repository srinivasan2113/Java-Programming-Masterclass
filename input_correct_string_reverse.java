import java.util.Scanner;
public class input_correct_string_reverse
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the lenght of the array: ");
        int n=sc.nextInt();
        String b[]=new String[n];
        System.out.print("enter the value for array: ");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            int start=0;
            int end=b.length-1;
            while(start<end)
            {
                String temp=b[start];
                b[start]=b[end];
                b[end]=temp;
            }
        }

    }
}












