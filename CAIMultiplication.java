import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        while (true) {
            int num1 = random.nextInt(9) + 1;  // 1 to 9
            int num2 = random.nextInt(9) + 1;
            
            int correctAnswer = num1 * num2;
            int userAnswer;
            
            System.out.printf("How much is %d times %d? ", num1, num2);
            userAnswer = input.nextInt();
            
            if (userAnswer == correctAnswer) {
                System.out.println("Very good!");
            } else {
                System.out.println("No. Please try again.");
                // Keep asking until correct
                while (userAnswer != correctAnswer) {
                    System.out.printf("How much is %d times %d? ", num1, num2);
                    userAnswer = input.nextInt();
                }
                System.out.println("Very good!");
            }
            
            System.out.print("Do you want another question? (y/n): ");
            String again = input.next();
            if (!again.equalsIgnoreCase("y")) break;
        }
    }
}