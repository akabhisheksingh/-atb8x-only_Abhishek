package task25thSept;

import java.util.Scanner;

public class Fctorial {
	public static void main(String[] args) {
		int factorial=1; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want factorial");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			factorial =factorial*i;
		}
	
		System.out.println(factorial);
		}
	
	}

