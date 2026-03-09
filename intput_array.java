import java.util.Scanner;
class put_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        String b[]=new String[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.next();
        }
        System.out.println("the give arrays are");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }   
}
