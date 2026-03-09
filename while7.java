//7️⃣ Reverse a number (ex: 1234 → 4321).

import java.util.Scanner;
class Reverse
{
 static Scanner sc = new Scanner(System.in);
 public static void main(String args[])
 {
    System.out.print("enter your value to reverse:");
    int rev = sc.nextInt();
    int rever = 0;

    while (rev>0){
        int last=rev%10;
        rever=rever*10+last;
        rev=rev/10;

    }
    System.out.println("the reversed number is:"+ rever);
 } 
}
