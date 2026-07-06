import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        int number = random.nextInt(1000) + 1;
        int guess;
        
        System.out.println("Guess a number between 1 and 1000");
        
        do {
            guess = input.nextInt();
            
            if (guess < number) System.out.println("Too low. Try again.");
            else if (guess > number) System.out.println("Too high. Try again.");
            else System.out.println("Congratulations! You guessed the number!");
        } while (guess != number);
    }
}