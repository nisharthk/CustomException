package com.customException;

import java.util.Scanner;

public class NumberRange {
	public static void main(String args[]) {
		try {
			System.out.println(" 	Custom Exception Example\n");
			System.out.print("Enter a Number between 0 and 100 : ");
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			input.close();
			if (x < 0 || x > 100)
				throw new NumberRangeException();
			else
				System.out.println("\nThe number entered is within range!");
		} catch (NumberRangeException e) {
			System.out.println("\nThe Number entered is not within range 0 and 100! " + e);
		}
	}
}
