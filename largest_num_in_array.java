public class largest_num_in_array {
    public static void main (String args[])
    {
        int large[]={23,55,87,94,48,94,84,94,4,22,10,2,4,5,5};
        int n=large.length;
        int check=0;
        int checks=999;

        for(int i=0;i<n;i++)
        {
            if(check<large[i])
            {
                check=large[i];
            }
            
        }
        System.out.println("The large value is: "+check);




        
        for(int i=0;i<n;i++)
        {
            if(checks>large[i])
            {
                checks=large[i];
            }
            
        }
        System.out.println("The smallest value is: "+checks);
    }
}
