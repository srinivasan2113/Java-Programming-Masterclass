public record binaray_search() {
    public static int binary(int[] arr, int target)
    {
          int start=0;
          int end = arr.length-1;
           while(start<=end)
           {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
                end=mid-1;
           }

           return-1;
    }   
    public static void main(String args[])
    {
        int arr[]={2,4,5,7,10,20,26,30,37};
        int target=20;

        int answer=binary(arr,target);
        System.out.println(answer);

    }
}
