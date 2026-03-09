class array_triangle
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=0;
                int g=0;
                
                for(int k=i;k<=j;k++)
                {
                   // System.out.print(arr[k]);
                    g=sum;
                    sum=sum+arr[k];
                    //System.out.print(sum);
                }
                System.out.println(arr[j]+"+"+g+"sum is : "+sum);
                
            }
        }
    }
}    