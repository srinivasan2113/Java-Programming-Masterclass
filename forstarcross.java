class forstarcross {
    public static void main(String args[])throws InterruptedException
    {
        int n = 5;
        int mid=n/2;
         
    
            for(int i = 0;i<n;i++)
            {
            for(int j=0;j<n;j++)
            {
                if(i==j  || 
                    i+j==n-1 || 
                    j==0 || 
                    j==n-1 || 
                    i==0 || 
                    i==n-1 || 
                    i==mid || 
                    j == mid) 
                {
                    System.out.print(" * ");
                    Thread.sleep(200);
                }
                else
                {
                    System.out.print("   ");
                    Thread.sleep(200);
                }
            }
            System.out.println();
            
            }
        }
    }
    

