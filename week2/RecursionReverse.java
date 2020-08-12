package week2;

import java.util.Scanner;

public class RecursionReverse {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int n;

		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Reverse of Input: ");
		reverseMethod(n);
	}

	private static void reverseMethod(int n) {

		if (n<10) {
			System.out.println(n);
			return;
		} else {
			System.out.print(n%10);
			reverseMethod(n/10);
		}
		
	}

}
