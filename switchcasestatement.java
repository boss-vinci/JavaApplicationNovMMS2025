import java.util.scanner;

public class MultipleSwitchCaseStatement{
	publi static void main (string[] args) {
		Scanner input = new Scanner(system.in);
		
		System.out.print("Enter your fullName: ");
		String fullName = input.nextLine();
		
		System.out.print("Enter your mark: ");
		int mark = input.nextInt();
		
		switch(mark/10) {
			case 0:
			case 1:
			case 2:
			case 3:
		            System.out.println("========================\n");
					System.out.printf("Student Name: %s%n",fullName);
					System.out.println("Student Grade: A");
					System.out.println("========================\n\n");
			
			case 4:
			break;
			        System.out.println("========================\n");
					System.out.printf("Student Name: %s%n",fullName);
					System.out.println("Student Grade: A");
					System.out.println("========================\n\n");
					
					
			case 5:
			break;
			        System.out.println("========================\n");
					System.out.printf("Student Name: %s%n",fullName);
					System.out.println("Student Grade: A");
					System.out.println("========================\n\n");
					
					
			case 6:
			break;
			        System.out.println("========================\n");
					System.out.printf("Student Name: %s%n",fullName);
					System.out.println("Student Grade: A");
					System.out.println("========================\n\n");
					
					
			case 7:
			case 8:
			case 9:
			case 10:
			        System.out.println("========================\n");
					System.out.printf("Student Name: %s%n",fullName);
					System.out.println("Student Grade: A");
					System.out.println("========================\n\n");
					
			break;
			default:
			        System.out.println("Invalid Input")
			
		}
		
	} 	