public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s%20s%n", "Number", "Factorial");
        
        for (int n = 1; n <= 20; n++) {
            long factorial = 1;
            
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            System.out.printf("%-10d%20d%n", n, factorial);
        }
    }
}