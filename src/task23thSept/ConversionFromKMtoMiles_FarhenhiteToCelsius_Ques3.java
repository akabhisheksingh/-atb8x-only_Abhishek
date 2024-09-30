package task23thSept;

import java.util.Scanner;

public class ConversionFromKMtoMiles_FarhenhiteToCelsius_Ques3 {
	public static void main(String[] args) {
		int x;
		double value;
		double miles, km, celsius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select any choice to convert between different units :"
				+ "1. kilometers to miles, "
				+ "2.miles to kilometers,"
				+ "3.Celsius to Fahrenheit,"
				+ "4.Fahrenheit to Celsius ");
		x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("Enter the value to be converted");
			value = sc.nextDouble();
			miles = value * 0.621371;
			System.out.println(value + " Km is converted to " + miles + " Miles.");
			break;
		case 2:
			System.out.println("Enter the value to be converted");
			value = sc.nextDouble();
			km = value * 1.60934;
			System.out.println(value + " miles is converted to " + km + " km.");
			break;
		case 3:
			System.out.println("Enter the value to be converted");
			value = sc.nextDouble();
			fahrenheit = (((double) (value * 9) / 5) + 32);
			System.out.println(value + " °C is converted to " + fahrenheit + " Fahrenheit.");
			break;
		case 4:
			System.out.println("Enter the value to be converted");
			value = sc.nextDouble();
			celsius = ((double) ((value - 32) * 5) / 9);
			System.out.println(value + " Fahrenheit is converted to " + celsius + " °C.");
			break;
		default:
			System.out.println("User entry is incorrect");

		}
		sc.close();

	}
}
