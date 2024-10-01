package task25thSept;

import java.util.Scanner;

public class TableQuestion1 {
	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print table of that number");
		int num = sc.nextInt();
		sc.close();
		System.out.println("By using While loop");
		while (i < 11) {
			System.out.print(num * i + " ");
			i++;
		}
		System.out.println();
		System.out.println("By using for loop");
		for (i = 1; i <= 10; i++) {
			System.out.print(i * num + " ");
		}

	}

}
