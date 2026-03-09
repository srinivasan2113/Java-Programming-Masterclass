public abstract class even_array_2 {
    public static void main(String args [])
    {
        int nums[]={1,2,3,9,18,20,32,15,80,77,43,22};
        int evencount=0;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                System.out.println(nums[i]);
                evencount++;
            }
        }
        System.out.println("total even number present: "+evencount);
    }
}
