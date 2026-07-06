import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalSales = 0.0;
        double itemPrice;
        
        System.out.println("Enter item prices (-1 to end):");
        
        while (true) {
            itemPrice = input.nextDouble();
            if (itemPrice == -1) break;
            totalSales += itemPrice;
        }
        
        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Earnings this week: $%.2f%n", earnings);
    }
}