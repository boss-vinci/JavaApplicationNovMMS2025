import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        
        System.out.println(isMultiple(a, b) ? "Multiple" : "Not a multiple");
    }
    
    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }
}