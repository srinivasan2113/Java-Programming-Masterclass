import java.util.Scanner;
public class input_string_reverse_array {
    static Scanner sc=new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.print("enter your size of the array:");
        int n=sc.nextInt();
        String b[]=new String[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.next();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(b[i]);
            System.out.print(" ");
        }
    }    
}
 