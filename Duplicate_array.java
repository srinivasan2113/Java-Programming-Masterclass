public class Duplicate_array {
    public static boolean inDuplicate(int[] arr)
    {
        int a=arr.length;
        int b=0;
        int c=0;
        for(int i=0;i<a;i++){
            b=arr[i];
            for (int j=i+1;j<a;j++)
            {
                c=arr[j];
                if(b==c)
                {
                    System.out.println("the Duplicate value is"+b);
                    return true;
                }

            }
        }
        return false;  
    }
    public static void main(String[] args)
    {
        int arr[]={8,1,5,2,3,1,5};
        boolean res=inDuplicate(arr);
        System.out.println(res);
    }
    
}
