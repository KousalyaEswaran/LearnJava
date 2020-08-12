package week2;

public class BubbleSort {
	//Write a Java Program for Bubble Sort in Descending Order
	public static void main(String[] args) {
		int arr[]= {1,6,3,4,5,20};
		int i,j,temp;
		System.out.println("Values before sort");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length-i-1; j++) {
				if (arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Values after sort");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
