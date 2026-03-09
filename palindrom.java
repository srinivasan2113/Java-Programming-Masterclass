import java.util.*;
public class palindrom {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String args [])
    {
        System.out.print("Enter your value to check it was panindrom or not:");
        int a=sc.nextInt();
        while(a>0)
        {
            int last = a%10;
            System.out.println(last);
            
        }

    }
    
}
