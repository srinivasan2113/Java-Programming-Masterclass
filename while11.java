//1️⃣1️⃣ Print Fibonacci series of N terms using while.

 // So, the sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 //0+1=1
 //1+1=2
 //1+2=3
 //2+3=5
 //3+5=8


import java.util.Scanner;
class Fibonacci{
static Scanner sc=new Scanner(System.in);
public static void main (String args [])
{
    System.out.print("enter the value for fibonacci:");
    int fib=sc.nextInt();

    int start=0;
    int end=1;

    while (start<=fib)
    {
        System.out.println(start);
        int ans=start+end;
        start=end;
        end=ans;

    }
}
}