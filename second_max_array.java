import java.util.Scanner;

public class second_max_array {
        static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("enter the lenth of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the arrays value:");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();                        // [2,4,8,10,9,5,6,10]
        }

        int max=Integer.MIN_VALUE;      //2
        int smax=Integer.MIN_VALUE;     //2

        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                smax=max;                  //smax=9
                max=a[i];                  //max=3
            }
            else if(a[i]>smax && a[i]!=max)
            {
                smax=a[i];                 //smax=9
            }
        }
        System.out.println("it was max value: "+max);

        System.out.println("it was second max value: "+smax);

    }
}
