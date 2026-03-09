import java.util.Scanner;
public class Bubble_sorted_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args [])
    {
        System.out.print("Enter the length of the array");
        int n = sc.nextInt();
        int b[]=new int[n];
        System.out.println("Enter the arrays till"+n+":");
        int temp=0;
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        // int b[]={7,3,8,2,8}
        for(int i=0;i<n-1;i++)                         //n=6   
        {
            for(int j=0;j<n-1-i;j++){
                if(b[j]>b[j+1])                     
                                                    
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }       
        }
        System.out.print("Sorted array: ");
         for (int x : b) {
            System.out.print(x + " ");
        }
    }  
}
