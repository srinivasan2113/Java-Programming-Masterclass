package constructor_pro;

public class Q5_electricity {
    int Units;
    int un;
    int Bill_Amount;

    Q5_electricity(int u) {
        Units = u;
        un = u; // initialize un properly with input
    }

    void display() {
        if (Units > 100) {
            un = un - 100;
            Bill_Amount = 100 * 5;

            if (Units > 200) {
                un = un - 100; 
                Bill_Amount = Bill_Amount + (100 * 7);
                Bill_Amount = Bill_Amount + (un * 10); // no need to check Units>200 again
            } else {
                Bill_Amount = Bill_Amount + (un * 7);
            }

        } else {
            Bill_Amount = Units * 5;
        }

        System.out.println("Units Consumed : " + Units);
        System.out.println("Bill Amount     : " + Bill_Amount);
    }

    public static void main(String args[]) {
        Q5_electricity b1 = new Q5_electricity(250);
        b1.display();
    }
}
