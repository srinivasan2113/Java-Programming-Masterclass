import java.util.Scanner;
class LCM{
static Scanner sc=new Scanner(System.in);
 public static int large(int A, int B)
 {
    int max=(A>B)?A:B;
    while(true)
    {
        if(max%A==0 && max%B==0)
        {
            return max;
        }
        max++;
    }
 }
 
 public static void main (String args[])
 {
    System.out.print("Enter your number:");
    int A=sc.nextInt();
    System.out.print("Enter your another number:");
    int B=sc.nextInt();
    int ans=large(A, B);
    System.out.println(ans);    
 }
}
