public class I_star {
    public static void main(String args[])
    {
        int n=5;
        int m=n/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==m || i==0 || i==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();

        }
    }
    
}
