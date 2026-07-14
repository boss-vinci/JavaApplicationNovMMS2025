import java.util.Scanner;
public class NumberCalculator{
	public static double smallestNumbs(double num1, double num2, double num3, double num4, double num5, double num6, double num7, double num8, double num9, double num10){ 
	double sumofNumz = ((num6 + num7 + num8 + num9) + (num2 + num4 + num9) / (num2 + num3 + num4 + num5));
	return sumofNumz;
	}
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--Enter 10 numbers");
		
		System.out.print("--Enter a value from num1:");
		double num1 = scan.nextInt();
		
		System.out.print("--Enter a value from num2:");
		double num2 = scan.nextInt();
		
		System.out.print("--Enter a value from num3:");
		double num3 = scan.nextInt();
		
		System.out.print("--Enter a value from num4:");
		double num4 = scan.nextInt();
		
		System.out.print("--Enter a value from num5:");
		double num5 = scan.nextInt();
		
		System.out.print("--Enter a value from num6:");
		double num6 = scan.nextInt();
		
		System.out.print("--Enter a value from num7:");
		double num7 = scan.nextInt();
		
		System.out.print("--Enter a value from num8:");
		double num8 = scan.nextInt();
		
		System.out.print("--Enter a value from num9:");
		double num9 = scan.nextInt();
		
		System.out.print("--Enter a value from num10:");
		double num10 = scan.nextInt();
		
		System.out.println("--the answer to this Math problem (num6 + num7 + num8 + num9) + (num2 + num4 + num9) / (num2 + num3 + num4 + num5) is = " + NumberCalculator.smallestNumbs(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10));	
		}
	}