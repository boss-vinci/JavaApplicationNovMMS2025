import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number (-1 to stop): ");
        double number = input.nextDouble();
        
        while (number != -1) {
            double rounded = Math.floor(number + 0.5);
            System.out.printf("Original: %.2f  Rounded: %.0f%n", number, rounded);
            
            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextDouble();
        }
    }
}