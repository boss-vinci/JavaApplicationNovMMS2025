import java.security.SecureRandom;
import java.util.Scanner;

public class CAIVaryingProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        
        System.out.print("Choose problem type (1=Add, 2=Sub, 3=Mul, 4=Div, 5=Mixed): ");
        int type = input.nextInt();
        
        int correct = 0;
        for (int i = 0; i < 10; i++) {
            int result = generateProblem(type, rand, input);
            if (result == 1) correct++;
        }
        
        double percent = correct * 10.0;
        System.out.printf("Score: %d/10 (%.0f%%)%n", correct, percent);
    }
    
    public static int generateProblem(int type, SecureRandom rand, Scanner input) {
        int a = 1 + rand.nextInt(9);
        int b = 1 + rand.nextInt(9);
        int answer = 0;
        char op = '+';
        
        switch (type) {
            case 1: answer = a + b; op = '+'; break;
            case 2: answer = a - b; op = '-'; break;
            case 3: answer = a * b; op = '*'; break;
            case 4: answer = a / b; op = '/'; b = a; a = answer * (1+rand.nextInt(5)); break; // avoid zero
            case 5: // mixed
                int t = 1 + rand.nextInt(4);
                return generateProblem(t, rand, input);
        }
        
        System.out.printf("%d %c %d = ? ", a, op, b);
        int user = input.nextInt();
        return (user == answer) ? 1 : 0;
    }
}