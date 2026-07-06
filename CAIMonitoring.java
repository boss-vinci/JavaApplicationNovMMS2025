import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        int correct = 0;
        int total = 0;
        
        System.out.println("=== Multiplication Drill ===\n");
        
        while (total < 10) {
            int num1 = 1 + random.nextInt(9);
            int num2 = 1 + random.nextInt(9);
            int answer = num1 * num2;
            
            System.out.printf("Q%d: How much is %d * %d? ", total+1, num1, num2);
            int userAnswer = input.nextInt();
            total++;
            
            if (userAnswer == answer) {
                correct++;
                System.out.println(getPositiveResponse(random));
            } else {
                System.out.println(getNegativeResponse(random));
            }
        }
        
        double percentage = (double) correct / total * 100;
        System.out.printf("%nYou got %d out of 10 correct (%.1f%%)%n", correct, percentage);
        
        if (percentage < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations! You are ready to go to the next level!");
        }
    }
    
    // Reuse the response methods from 5.36
    public static String getPositiveResponse(SecureRandom rand) {
        String[] responses = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        return responses[rand.nextInt(4)];
    }
    
    public static String getNegativeResponse(SecureRandom rand) {
        String[] responses = {"No. Please try again.", "Wrong. Try once more.", 
                              "Don't give up!", "Keep trying."};
        return responses[rand.nextInt(4)];
    }
}