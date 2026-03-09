//8️⃣ Check if a number is palindrome (ex: 151 → 151 is palindrome).
import java.util.Scanner;
class palindrome
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args [])
    {
        System.out.print("Enter your value to check palindrome or not:");
        int pal = sc.nextInt();
        System.out.println("your enterd value is :"+pal);
        int epal=pal;

        int rev = 0;

        while(pal>0){
        int last = pal%10;
        rev=rev*10+last;
        pal=pal/10;
        }
        
        if(epal==rev){
            System.out.println(epal+" is palindrome");
        }
        else{
            System.out.println(epal+" is not palindrome");
        }
}
}