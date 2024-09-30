package task20thSept;

import java.util.Scanner;

public class TriangleClassifierQuestion3Solution {
	/*
	 * / Write a program that classifies a triangle based on its side lengths. Given
	 * three input values representing the lengths of the sides, determine if the
	 * triangle is equilateral (all sides are equal),
	 * 
	 * isosceles (exactly two sides are equal), or scalene (no sides are equal). Use
	 * an if-else statement to classify the triangle. side1, side2, side3 /
	 */
	public static void main(String[] args) {
		// double side1 = 7, side2 = 6, side3 = 67;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for side 1");
		double side1 = sc.nextDouble();
		System.out.println("Enter the value for side 2");
		double side2 = sc.nextDouble();
		System.out.println("Enter the value for side 3");
		double side3 = sc.nextDouble();
		sc.close();
		if (side1 >= 1 && side2 >= 1 && side3 >= 1) {
			if (side1 == side2 && side2 == side3 && side3 == side1) {
				System.out.println("Equilateral Triangle");
			} else if (side1 == side2 || side2 == side3 || side3 == side1) {
				System.out.println("Isosceles Triangle");
			} else {
				System.out.println("Scalene Triangle");
			}
		} else {
			System.out.println("Invalid value for side");
		}
	}

}
