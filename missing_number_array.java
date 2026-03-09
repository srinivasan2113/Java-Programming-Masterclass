public class missing_number_array {
    public static void main(String args[])
    {
        int arr[]={2,3,5,4};
        int n=5;

        int expectedSum=(n*(n+1))/2;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("expected sum is:"+expectedSum);
        System.out.println("actual sum is"+sum);
        System.out.println("missing number is:"+(expectedSum-sum));
    }
}
