import java.util.Scanner;
import java.lang.Math;

public class calculator {
	public static void main(String args[]){

		System.out.println("Select an operation: ");
		System.out.println("1. Addition (+) ");
		System.out.println("2. Subtraction (-) ");
		System.out.println("3. Multiplication (*) ");
		System.out.println("4. Division (/) ");
		System.out.println("5. Square Root (*) ");
		System.out.println("6. Squaring (^2) ");

		Scanner userInput = new Scanner(System.in);
		int receivedInput = userInput.nextInt();

		if (receivedInput == 1){
			System.out.println("Addition selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();
			addition(digitA, digitB);
		}
		else if(receivedInput == 2)
		{
			System.out.println("Subtraction selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();			
			subtraction(digitA, digitB);
		}
		else if(receivedInput == 3)
		{
			System.out.println("Multiplication selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();			
			multiplication(digitA, digitB);
		}
		else if(receivedInput == 4)
		{
			System.out.println("Division selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();			
			division(digitA, digitB);
		}
		else if(receivedInput == 5)
		{
			System.out.println("Square root selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();
			squareroot(digitA);
		}
		else if(receivedInput == 6)
		{
			System.out.println("Squaring selected!");
			System.out.println("Enter a number: ");
			int digitA = userInput.nextInt();	
			System.out.println("Enter another number");
			int digitB = userInput.nextInt();				
			squaring(digitA, digitB);
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
		public static int division(int a, int b)
		{
		int c = a / b;
		System.out.println(a + "÷" + b + "=" + c);
		return c;
		}
		public static int squareroot(int a)
		{
		float c = Math.sqrt(a);
		System.out.println("The square root of " + a + "is");
		return c;
		}
		public static int squaring(int a, int b)
		{
		float c = Math.pow(a, b);
		System.out.println(a + "to the power of" + b + "is");
		return c;
		}



	
}