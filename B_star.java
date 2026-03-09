public class B_star {
    public static void main (String args[])
    {
        int n=7;
        int r=4;
        
        
        for (int i=0; i<n; i++)
        {
            for(int j=0;j<r;j++)
            {
                if(j==0 || (i==0 && j!=r-1 )|| (i==n-1 && j!=r-1)|| (i==n/2 && j!=r-1) || (j==r-1 && i!=0 && i!=n-1 && i!=r-1)  )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
