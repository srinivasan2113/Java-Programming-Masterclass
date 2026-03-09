public class addaition_array {
    public static void main(String args [])
    {
        int add[]={10+20+30+40+50};
        int n=add.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+add[i];
        }
        System.out.println("sum of array is: "+sum);
    }
    
}
