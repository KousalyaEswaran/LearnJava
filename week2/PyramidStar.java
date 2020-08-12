package week2;

import java.util.Scanner;

public class PyramidStar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number of lines :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int k =1;
			while (k < i) {
				System.out.print("* ");
				k++;
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
