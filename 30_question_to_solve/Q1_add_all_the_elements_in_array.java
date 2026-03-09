import java.util.*;
public class Q1_add_all_the_elements_in_array {
static Scanner sc=new Scanner(System.in);
public static int add(int[] a,int n)
{
    int sum=0;
    for(int j=0;j<n;j++)
    {
        sum=sum+a[j];
    }
    return sum;
}
public static void main(String args[])
{
    System.out.print("Enter length of the array:");
    int n=sc.nextInt();

    int a[]=new int[n];
    System.out.println("Enter the array values:");


    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int answer=add(a,n);
    System.out.println("the addition of array is:"+answer);
}
}
