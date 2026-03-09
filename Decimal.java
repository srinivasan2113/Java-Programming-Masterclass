import java.util.Scanner;
class Decimal
{
    static Scanner sc=new Scanner(System.in);
    public static String convertToBinary(int decimal)
    {
        String binary="";
        while (decimal >0)
        {
            int rem = decimal %2;
            System.out.println("rem"+rem);
            binary = rem+binary;
            System.out.println("binary"+binary);
            decimal =decimal/2;
            System.out.println("decimal"+decimal);
        }
        return binary;
    }
    public static void main (String args [])
    {
        System.out.print("enter your decimal number;");
        int decimal = sc.nextInt();

        String ans = convertToBinary(decimal);
        System.out.println("decimal: "+ans);
    }
}