package task23thSept;

import java.util.Scanner;

public class MonthQuestion2 {
	public static void main(String[] args) {
		System.out.println("Enter the month value in numeric form");
		Scanner sc = new Scanner(System.in);
		int monthValue = sc.nextInt(); 
		switch(monthValue) {
		case 1: 
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("MAR");
			break; 
		case 4:
			System.out.println("APR");
			break;
		case 5:
			System.out.println("MAY");
			break;			
		case 6:
			System.out.println("JUNE");
			break;
		case 7:
			System.out.println("JULY");
			break;
		case 8:
			System.out.println("AUG");
			break;
		case 9:
			System.out.println("SEPT");
			break;
		case 10:
			System.out.println("OCT");
			break;
		case 11:
			System.out.println("NOV");
			break;
		case 12:
			System.out.println("DEC");
			break; 
			default:
				System.out.println("Please check your value: Month value from 1 to 12");
		}
		sc.close();
	}

}
