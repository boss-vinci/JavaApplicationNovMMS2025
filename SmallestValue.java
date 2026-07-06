import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of values to input: ");
        int count = input.nextInt();
        
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();
            
            if (number < smallest) {
                smallest = number;
            }
        }
        
        System.out.println("Smallest value is: " + smallest);
    }
}