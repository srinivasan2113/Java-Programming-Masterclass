
import java.util.*;
public class zero_at_star_array {
    public static void main (String args[])
    {
        int a[]={1,0,2,0,3,4,0,5};
        int n=a.length;
        int b[]=new int[n];

        int zerocounter=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zerocounter++;
            }
        }
        System.out.println("total number of zero: "+zerocounter);

        int k=zerocounter;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                System.out.print(a[i]+" ");
                b[k++]=a[i];
            }
            System.out.println(" ");
        }
        System.out.println(Arrays.toString(b));
    }
}
