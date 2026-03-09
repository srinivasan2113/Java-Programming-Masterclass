import java.util.*;
public class zero_at_star_method_two_array {
    public static void main(String args[])
    {
        int arr[]={1,1,0,1,0,0,1,1,0};
        int i=0,j=0;
        int n=arr.length;

        while(j<n)
        {
            if(arr[j] == 1)
                {
                    int temp=arr[i];  //2[1]
                    arr[i]=arr[j];   //3[0]
                    arr[j]=temp;    //2[1]
                    i++;
                   
                }
                 j++;
        }
        
        System.out.println("after");
        System.out.println(Arrays.toString(arr));
    }
}
