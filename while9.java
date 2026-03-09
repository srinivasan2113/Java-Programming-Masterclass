//9️⃣ Find the sum of digits of a number (ex: 753 → 7+5+3 = 15).
import java.util.Scanner;
class sumofdigits
{
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
    System.out.println("Enter your value to sum:");
    int val=sc.nextInt();
    System.out.println("your entered value is:"+val);
    
    int sum = 0;
    while(val>0)
    {
        int last=val%10;
        sum = sum+last;
        val=val/10;
    }
    System.out.println(sum);

}
}