import java.util.Scanner;

public class IntegerPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
        
        System.out.printf("%d to the power %d = %d%n", 
                         base, exponent, integerPower(base, exponent));
    }
    
    public static int integerPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}