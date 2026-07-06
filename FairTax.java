import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalExpenses = 0.0;
        
        System.out.println("FairTax Calculator (23% consumption tax)\n");
        
        System.out.print("Housing expense: ");
        totalExpenses += input.nextDouble();
        
        System.out.print("Food expense: ");
        totalExpenses += input.nextDouble();
        
        System.out.print("Clothing expense: ");
        totalExpenses += input.nextDouble();
        
        System.out.print("Transportation expense: ");
        totalExpenses += input.nextDouble();
        
        System.out.print("Education expense: ");
        totalExpenses += input.nextDouble();
        
        System.out.print("Health care expense: ");
        totalExpenses += input.nextDouble();
        
        System.out.print("Vacations expense: ");
        totalExpenses += input.nextDouble();
        
        double fairTax = totalExpenses * 0.23;
        System.out.printf("%nEstimated FairTax you would pay: $%.2f%n", fairTax);
    }
}