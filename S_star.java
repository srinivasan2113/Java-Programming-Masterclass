class S_star {
    public static void main(String args[])
    {
        int n=5;
        int m=n/2;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==m || i==n-1 || (j==0 && i<=m) || (j==n-1 && i>=m))
                {
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
