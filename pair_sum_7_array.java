public class pair_sum_7_array {
    public static void main(String args[])
    {
        int arr[]={2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ans=arr[i]+arr[j];
                if(ans==7)
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
