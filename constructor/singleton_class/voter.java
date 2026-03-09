package singleton_class;

public class voter {

    public static void main(String[] args) {

        primeminster pm1 = primeminster.getPm();
        System.out.println(pm1.pmName);

        // Try creating another reference
        primeminster pm2 = primeminster.getPm();
        System.out.println(pm2.pmName);

        // Check if both references are same
        System.out.println(pm1 == pm2);  // true
    }
}
