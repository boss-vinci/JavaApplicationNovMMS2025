import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalMiles = 0;
        int totalGallons = 0;
        int miles;
        int gallons;
        
        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();
        
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();
            
            if (gallons != 0) {
                double mpg = (double) miles / gallons;
                System.out.printf("MPG for this trip: %.2f%n", mpg);
                
                totalMiles += miles;
                totalGallons += gallons;
            }
            
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
        
        if (totalGallons != 0) {
            double overallMPG = (double) totalMiles / totalGallons;
            System.out.printf("%nCombined MPG for all trips: %.2f%n", overallMPG);
        } else {
            System.out.println("No trips entered.");
        }
    }
}