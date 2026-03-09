//6️⃣ Count digits of a number (ex: 4932 → 4 digits).
import java.util.Scanner;
class Count{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
     System.out.print("Enter you value to count the digits:");
     int digit=sc.nextInt();
     System.out.println("the enterd value is:"+digit);

     int count = 0;
     while (digit>0)
     {
        int lastdigit = digit%10;
        count=count+1;
        System.out.println(lastdigit);
        digit=digit/10;
     }
     System.out.println("digits:"+count);
    }
}