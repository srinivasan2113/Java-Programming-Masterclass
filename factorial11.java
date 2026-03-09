import java.util.Scanner;
public class factorial11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter your factorial value:");
        int fact = sc.nextInt();
        int num=0;
        int a=1;
        while(fact>=a)
        {
            num=num+a;
            a++;
        }
        num=num/2;
        System.out.println("the factorl of " + fact + " is: "+num); 

    }    
    
}
