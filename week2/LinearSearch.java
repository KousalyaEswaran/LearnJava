package week2;

import java.util.Scanner;

public class LinearSearch {

	@SuppressWarnings({ "unused", "resource", "null" })
	public static void main(String[] args) {
		//Write a Java Program for Linear Search
		int n,search,i;
		boolean bool = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n = s.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the values: ");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter value to be searched: ");
		search = s.nextInt();
		
		for (i = 0;  i < arr.length; i++) {
			if (arr[i] == search) {
				bool = true;
			}
		}
		
		if (bool) {
			System.out.println("Value " + n + " present in the list");
		} else {
			System.out.println("Value " + n + " not present in the list");
		}
	}

}
