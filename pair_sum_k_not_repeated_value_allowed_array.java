
public class pair_sum_k_not_repeated_value_allowed_array {
    public static void main(String args[])
    {
        int arr[] = {1, 5, 7, 1, 5};
        int n=arr.length;
        int b[]=new int[n];
        int key=6;
        int count=0;

        for(int i=0;i<n;i++)
        {
            int k=count++;
            for(int j=i+1;j<n;j++)
            {
                
                int sum=arr[i]+arr[j];
                
                if(sum==key)
                {
                    b[k]=arr[i];
                    System.out.println(b[k]);
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
