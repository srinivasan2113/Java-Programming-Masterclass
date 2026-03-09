class srinivasan
{
    public static void main(String args []) throws Exception
    {
        int n=5;
        int m=n/2;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || i==m || (j==0 && i<m) || (j==n-1 && i>m))
                {
                    System.out.print("* ");
                    Thread.sleep(100);
                    
                }
                else
                {
                    System.out.print("  ");
                }
                
            }
            System.out.print("  ");
             for(int j=0;j<n;j++)
            {
                if(i==0 || i==j+1 || i==m || (j==0 ) || (j==n-1 && i<m))
                {
                    System.out.print("* ");
                    Thread.sleep(100);
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
             for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==m )
                {
                    System.out.print("* ");
                    Thread.sleep(100);
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
             for(int j=0;j<n;j++)
            {
                if(j==0 || j==n-1 || j==i)
                {
                    System.out.print("* ");
                    Thread.sleep(100);
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
             for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==m )
                {
                    System.out.print("* ");
                    Thread.sleep(100);
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