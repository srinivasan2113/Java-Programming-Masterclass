class star5X5
{
    public static void main(String args []) throws InterruptedException
    {
        int n=5;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
                Thread.sleep(200);

            }
            System.out.println();
        }
    }
}