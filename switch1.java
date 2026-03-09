import java.util.Scanner;
class fruit
{
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
   System.out.print("Enter your fruit:");
   String fruit = sc.nextLine();  
   System.out.println("the entered fruit is:"+fruit);
   

   switch (fruit)
   {
      case "apple":
         System.out.println("red fruit");
         break;
      case "orange":
         System.out.println("orange fruit");
         break;
      case "banana":
         System.out.println("yellow fruit");
         break;
      default:
         System.out.println("color of this fruit can't find");

   }
}
}