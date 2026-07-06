import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        double charge;
        
        System.out.println("Parking Charges Calculator (Enter 0 to stop)\n");
        
        while (true) {
            System.out.print("Enter hours parked (0 to quit): ");
            double hours = input.nextDouble();
            
            if (hours == 0) break;
            
            charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Charge for this customer: $%.2f%n", charge);
        }
        
        System.out.printf("%nTotal receipts yesterday: $%.2f%n", totalReceipts);
    }
    
    public static double calculateCharges(double hours) {
        if (hours <= 3) {
            return 2.00;
        } else {
            double charge = 2.00 + (hours - 3) * 0.50;
            return Math.min(charge, 10.00);
        }
    }
}