class R_star {
    public static void main(String args[]) {

        int n = 5;
        int m = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (
                    j == 0 ||                     
                    i == 0 ||                    
                    i == m ||                    
                    (j == n - 1 && i <= m) ||     
                    (i - j == m - 1)              
                   ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
