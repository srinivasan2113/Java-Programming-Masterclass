//Q1. Food Menu System (Nested Switch)
//Ask the user to choose:
//Food Type → (1: Veg, 2: Non-Veg)
//Then choose an item based on the type:
//Veg items:
//1: Idly
//2: Dosa
//Non-Veg items:
//1: Chicken Biryani
//2: Mutton Biryani
//Print the selected food item.

import java.util.Scanner;
class Nested
{
    static Scanner sc = new Scanner (System.in);
    public static void main(String args[])
    {
        System.out.println("Food Menu System");
        System.out.println("choose 1 for veg food");
        System.out.println("choose 2 for Non-Veg food");
        System.out.print("Eneter your value:");
        int food=sc.nextInt();
        System.out.println("the choose no. is :"+food);

        switch(food)
        {
            case 1:
            System.out.println("Veg Food");
            System.out.println("choose 1 for Idly");
            System.out.println("choose 2 for Dosa");
            System.out.print("Eneter your value:");
            int veg=sc.nextInt();
            System.out.println("the choose no. is :"+veg);

            switch(veg)
            {
                case 1: System.out.println("Idly");
                System.out.println("choose 1 for sambar");
                System.out.println("choose 2 for chutuny");
                System.out.print("Enter your value:");
                int sidedish=sc.nextInt();
                System.out.println("The entered value is:"+sidedish);
                switch(sidedish)
                {
                    case 1: System.out.println("sambar"+" idly");
                    break;
                    case 2: System.out.println("chutuny"+" idly"); 
                }
                break;
                case 2: System.out.println("Dosa");
                System.out.println("choose 1 for sambar");
                System.out.println("choose 2 for chutuny");
                System.out.print("Enter your value:");
                int side=sc.nextInt();
                System.out.println("The entered value is:"+side);
                switch(side)
                {
                    case 1: System.out.println("sambar"+" dosa");
                    break;
                    case 2: System.out.println("chutuny"+" dosa"); 
                }
                break;

            }
            break;

            case 2:
            System.out.println("NonVeg Food");
            System.out.println("choose 1 for Chicken Biryani");
            System.out.println("choose 2 for Mutton Biryani");
            System.out.print("Eneter your value:");
            int nonveg=sc.nextInt();
            System.out.println("the choose no. is :"+nonveg);

            switch(nonveg)
            {
                case 1: System.out.println("Chicken Biryani");
                break;
                case 2: System.out.println("Mutton Biryani");
                break;
                default: System.out.println("your order is not valid");

            }
            break;

            default:
                System.out.println("enter only 1 or 2");
    
        }
         
    }
}