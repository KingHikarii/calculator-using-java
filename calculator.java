import java.util.Scanner;
import java.lang.Math;

public class calculator {
	public static void main(String args[]){

while(true) {
		System.out.println();
		System.out.println("Select an operation: ");
		System.out.println("1. Addition (+) ");
		System.out.println("2. Subtraction (-) ");
		System.out.println("3. Multiplication (*) ");
		System.out.println("4. Division (/) ");
		System.out.println("5. Square Root (*) ");
		System.out.println("6. Exponential (^n) ");
		System.out.println("To Exit Press 0");

		Scanner userInput = new Scanner(System.in);
		int receivedInput = userInput.nextInt();

	

		if (receivedInput == 1){
			System.out.println("Addition selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();
			System.out.println();
			addition(digitA, digitB);
		}
		else if(receivedInput == 2)
		{
			System.out.println("Subtraction selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();
			System.out.println();			
			subtraction(digitA, digitB);
		}
		else if(receivedInput == 3)
		{
			System.out.println("Multiplication selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();
			System.out.println();			
			multiplication(digitA, digitB);
		}
		else if(receivedInput == 4)
		{
			System.out.println("Division selected!");
			System.out.println("Enter a number: ");
			double digitA = userInput.nextInt();
			System.out.println("Enter another number");
			double digitB = userInput.nextInt();
			System.out.println();			
			division(digitA, digitB);
			
		}
		else if(receivedInput == 5)
		{
			System.out.println("Square root selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println();
			squareroot(digitA);
		}
		else if(receivedInput == 6)
		{
			System.out.println("Exponent selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();	
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();
			System.out.println();				
			exponent(digitA, digitB);
			}
		else if(receivedInput == 0)
		{
			break;
		}
		}
}
		//Creating the methods for the operations here.

		public static int addition(int a, int b)
		{
			int c = a + b;
			System.out.println(a + "+" + b + "=" + c);
			return c;
		}
		
		public static int subtraction(int a, int b)
		{
		int c = a - b;
		System.out.println(a + "-" + b + "=" + c);
		return c;
		}
		public static int multiplication(int a, int b)
		{
		int c = a * b;
		System.out.println(a + "x" + b + "=" + c);
		return c;
		}
		public static double division(double a, double b)
		{
		double c = a / b;
		System.out.println(a + "/" + b + "=" + c);
		return c;
		}
		public static double squareroot(int a)
		{
		double c = Math.sqrt(a);
		System.out.println("The square root of " + a + " is " + c);
		return c;
		}
		public static double exponent(int a, int b)
		{
		double c = Math.pow(a, b);
		System.out.println(a + " to the power of " + b + " is " + c);
		return c;
		}



	
}