//Q6. Online Shopping (Category → Product)
//Category:
//Electronics
//Clothing
//Grocery

//Electronics:
//1: Mobile
//2: Laptop
//3: TV

//Clothing:
//1: Shirt
//2: Jeans

//Grocery:
//1: Rice
//2: Oil
//3: Vegetables
//Print the selected product and price.

import java.util.Scanner;
class Shopping
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("======================ONLINE SHOPPING====================");
        System.out.println("CATEGORY:");
        System.out.println("Choose 1 for Electronics");
        System.out.println("Choose 2 for Clothing");
        System.out.println("Choose 3 for Grocery");
        System.out.print("enter your value:");
        int cat=sc.nextInt();
        System.out.println("The enterd value is "+cat);
        switch (cat)
        {
            case 1 : System.out.println("------ELECTRONICS------");
            System.out.println("choose 1 for Mobile");
            System.out.println("choose 2 for Laptop");
            System.out.println("choose 3 for TV");
            System.out.print("Enter your value for electronics:");
            int electro=sc.nextInt();
            System.out.println("The enterd value is :"+electro);
            switch (electro)
            {
                case 1:System.out.println("Mobile");
                break;
                case 2:System.out.println("laptop");
                break;
                case 3:System.out.println("TV");
                break;
                default:
                    System.out.println("enter the valid no. 1 or 2");
            }
            break;
            case 2 : System.out.println("------Clothing------");
            System.out.println("choose 1 for shirt");
            System.out.println("choose 2 for jeans");
            System.out.print("Enter your value for Clothing:");
            int clo=sc.nextInt();
            System.out.println("The enterd value is :"+clo);
            switch (clo)
            {
                case 1:System.out.println("Shirt");
                break;
                case 2:System.out.println("Jeans");
                break;
                default:
                    System.out.println("enter the valid no. 1 or 2");
            }
            break;
            case 3 : System.out.println("------GROCERY------");
            System.out.println("choose 1 for Rice");
            System.out.println("choose 2 for Oil");
            System.out.println("choose 3 for Vegtable");
            System.out.print("Enter your value for electronics:");
            int Gro=sc.nextInt();
            System.out.println("The enterd value is :"+Gro);
            switch (Gro)
            {
                case 1:System.out.println("Rice");
                break;
                case 2:System.out.println("oil");
                break;
                case 3:System.out.println("Vegtable");
                break;
                default:
                    System.out.println("enter the valid no. 1 or 2");
            } 
            break;
            default:
                System.out.println("enter the valid no. 1 or 2");
        }
    }
}