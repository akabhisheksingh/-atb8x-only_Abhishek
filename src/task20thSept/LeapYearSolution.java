package task20thSept;

import java.util.Scanner;

public class LeapYearSolution {
	public static void main(String[] args) {
		System.out.println("Enter the year value");
		Scanner sc = new Scanner(System.in); 
		int year = sc.nextInt(); 
		if(year%400==0 ||year%100!=0 && year%4==0) {
			System.out.println("Leap Year: "+year);
		} else {
			System.out.println("It is not a leap year");
		}
		sc.close();
	}

}
