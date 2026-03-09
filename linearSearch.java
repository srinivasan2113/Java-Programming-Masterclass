import java.util.*;
public class linearSearch {
    static Scanner sc=new Scanner(System.in);
    public static int linearSearch(int[] arr,int key)
    {
        int s=arr.length;
        for(int i=0;i<s;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        System.out.print("enter your value");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of the array are:");
        System.out.println(Arrays.toString(arr));
        int key=sc.nextInt();
        int ans=linearSearch(arr,key);
        System.out.println("the index of the key is:"+ans);
    }
}
