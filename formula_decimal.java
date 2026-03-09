import java.util.*;
public class formula_decimal {
    static Scanner sc=new Scanner(System.in);
    public static int fordec(int decimal)
    {
        String binary="";
        int temp=decimal;
        //decimal to binary
        while(temp>0)
        {
            int dec=temp%2;
            binary=dec+binary;
            temp=temp/2;
        }
        //binary to decimal
        int bd=Integer.parseInt(binary);
        int add=0;
        int power=0;
        while(bd>0)
        {
            int bit=bd%10;
            add=add+bit*(int) Math.pow(2,power);
            power++;
            bd=bd/10;
        }
        return add;

    }
    public static void main (String args[])
    {
        System.out.print("Enter your value: ");
        int decimal=sc.nextInt();
        int ans=fordec(decimal);
        System.out.println(ans);
    }

    
}
