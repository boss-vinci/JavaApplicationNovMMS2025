import java.util.Scanner;

public class SquareOfCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side: ");
        int side = input.nextInt();
        System.out.print("Enter fill character: ");
        char fill = input.next().charAt(0);
        
        squareOfAnyCharacter(side, fill);
    }
    
    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(fillCharacter + " ");
            }
            System.out.println();
        }
    }
}