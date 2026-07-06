import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int accountNumber;
        int balance;
        int charges;
        int credits;
        int creditLimit;
        
        System.out.print("Enter account number (-1 to quit): ");
        accountNumber = input.nextInt();
        
        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            balance = input.nextInt();
            System.out.print("Enter total charges: ");
            charges = input.nextInt();
            System.out.print("Enter total credits: ");
            credits = input.nextInt();
            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();
            
            int newBalance = balance + charges - credits;
            System.out.printf("New balance: %d%n", newBalance);
            
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
            
            System.out.print("\nEnter account number (-1 to quit): ");
            accountNumber = input.nextInt();
        }
    }
}