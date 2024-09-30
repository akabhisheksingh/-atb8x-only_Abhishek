package task23thSept;

import java.util.Scanner;

public class CalculatorProgramQues1 {
	/*Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based 
	 * on user input using switch statements.
	 * Inputs :   num 1, num 2, +
	 * Output :  num1+num2 → print information.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = sc.nextDouble();

		System.out.println("Enter the second number: ");
		double num2 = sc.nextDouble();

		System.out.println("What kind of opeation: You want to do in Calculator:");
		String operation = sc.next();
		double value = 0.0;

		switch (operation) {
		case "+":
			value = num1 + num2;
			System.out.println("Result = " + value);
			break;
		case "-":
			value = num1 - num2;
			System.out.println("Result = " + value);
			break;
		case "*":
			value = num1 * num2;
			System.out.println("Result = " + value);
			break;
		case "/":
			value = num1 / num2;
			System.out.println("Result = " + value);
			break;
		case "%":
			value = num1 % num2;
			System.out.println("Result = " + value);
			break;
		default:
			System.out.println("You can do only these operation +,-,*,/ or %.");
		}

	}

}
