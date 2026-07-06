import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int number;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}