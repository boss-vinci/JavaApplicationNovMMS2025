import java.util.Scanner;
import java.security.SecureRandom;

enum Coin { HEADS, TAILS }

public class CoinTossing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        int heads = 0, tails = 0;
        
        System.out.println("1. Toss Coin\n2. Exit");
        
        while (true) {
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            
            if (choice == 2) break;
            if (choice == 1) {
                Coin result = flip();
                System.out.println(result);
                if (result == Coin.HEADS) heads++;
                else tails++;
            }
        }
        
        System.out.printf("Heads: %d, Tails: %d%n", heads, tails);
    }
    
    public static Coin flip() {
        SecureRandom rand = new SecureRandom();
        return rand.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}