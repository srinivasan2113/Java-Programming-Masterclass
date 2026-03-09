import java.util.Scanner;

public class own_decimal {
    static Scanner sc = new Scanner(System.in);

    public static int contodec(int decimal) {

        // Step 1: Decimal → Binary
        String binary = "";
        int temp = decimal;

        while (temp > 0) {
            int mod = temp % 2;
            binary = mod + binary;
            temp = temp / 2;
        }

        System.out.println("Binary value: " + binary);
        String ninary=binary;

        // Step 2: Binary → Decimal (manual calculation)
        int add = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            add = add + (bit * (int) Math.pow(2, power));
            power++;
        }

        // step 3: Binary->decimal(simple)
        int auto=Integer.parseInt(ninary,2);
        System.out.println("Decimal: "+auto);

        return add;
    }

    public static void main(String args[]) {
        System.out.print("Enter your number: ");
        int decimal = sc.nextInt();

        int ans = contodec(decimal);
        System.out.println("The decimal of " + decimal + " is: " + ans);
    }
}
