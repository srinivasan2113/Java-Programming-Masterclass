
public class rightRotateByK {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int k=5;
        for(int j=1;j<=k;j++)
        {
            int last = arr[n-1];
            for(int i=n-2;i>=0;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[0]=last;
        }
        System.out.println("Array after right rotation:");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    
}
}
