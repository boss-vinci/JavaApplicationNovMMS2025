import java.util.Scanner;

public class RoundingMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double x = input.nextDouble();
        
        System.out.printf("Original: %.4f%n", x);
        System.out.printf("Nearest integer: %d%n", roundToInteger(x));
        System.out.printf("Nearest tenth: %.1f%n", roundToTenths(x));
        System.out.printf("Nearest hundredth: %.2f%n", roundToHundredths(x));
        System.out.printf("Nearest thousandth: %.3f%n", roundToThousandths(x));
    }
    
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }
    
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}