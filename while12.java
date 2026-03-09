import java.util.Scanner;

class GCD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter your first value: ");
        int a = sc.nextInt();
        System.out.print("Enter your second value: ");
        int b = sc.nextInt();

        int rogA = a;
        int rogB = b;

        // Repeated Subtraction Logic
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println(a);
            } else {
                b = b - a;
                System.out.println(b);
            }
        }

        // When a == b, that value is the GCD
        System.out.println("The GCD of " + rogA + " and " + rogB + " is: " + a);
    }
}