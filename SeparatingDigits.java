import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer (1-99999): ");
        int number = input.nextInt();
        
        displayDigits(number);
    }
    
    public static void displayDigits(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i < str.length() - 1) System.out.print("   ");
        }
        System.out.println();
    }
}