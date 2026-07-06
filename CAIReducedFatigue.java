import java.security.SecureRandom;
import java.util.Scanner;

public class CAIReducedFatigue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        while (true) {
            int num1 = 1 + random.nextInt(9);
            int num2 = 1 + random.nextInt(9);
            int answer = num1 * num2;
            
            askQuestion(num1, num2);
            int userAnswer = input.nextInt();
            
            if (userAnswer == answer) {
                System.out.println(getPositiveResponse(random));
            } else {
                System.out.println(getNegativeResponse(random));
                // Loop until correct
                while (userAnswer != answer) {
                    askQuestion(num1, num2);
                    userAnswer = input.nextInt();
                }
                System.out.println(getPositiveResponse(random));
            }
            
            System.out.print("\nAnother question? (y/n): ");
            if (!input.next().equalsIgnoreCase("y")) break;
        }
    }
    
    public static void askQuestion(int a, int b) {
        System.out.printf("How much is %d times %d? ", a, b);
    }
    
    public static String getPositiveResponse(SecureRandom rand) {
        int choice = rand.nextInt(4);
        switch (choice) {
            case 0: return "Very good!";
            case 1: return "Excellent!";
            case 2: return "Nice work!";
            default: return "Keep up the good work!";
        }
    }
    
    public static String getNegativeResponse(SecureRandom rand) {
        int choice = rand.nextInt(4);
        switch (choice) {
            case 0: return "No. Please try again.";
            case 1: return "Wrong. Try once more.";
            case 2: return "Don't give up!";
            default: return "Keep trying.";
        }
    }
}