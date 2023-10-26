package com.oct_25;

import java.util.Scanner;

public class DataDriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		System.out.println("Enter array 1:");
		ArrayOperations.accept(arr);
		
		int choice = 0;

		do {
			ArrayOperations.menu();
			System.out.print("Enter your choice: ");
			int option = sc.nextInt();

			switch (option) {
			case 1:                                     //sum
				int[][] arr1 = new int[3][3];
				System.out.println("Enter array 2 to add in array 1:");
				ArrayOperations.accept(arr1);

				int[][] add = ArrayOperations.addOfArray(arr, arr1);
				System.out.println("\nAddition of 2 array: ");
				ArrayOperations.display(add);
				break;
			case 2:
				System.out.println("\nTransposed array: ");
				int[][] transposearr=ArrayOperations.transpose(arr);
				ArrayOperations.display(transposearr);
				break;
			case 3:                                      //minimum
				ArrayOperations.findMin(arr);
				break;
			case 4:                                       //maximum
				ArrayOperations.findMax(arr);
				break;
			case 5:                                       //display
				ArrayOperations.display(arr);
				break;
			case 6:                                       //appearance
				System.out.print("Enter number to get no. of appearance :");
				int num=sc.nextInt();
				num=ArrayOperations.Appearance( arr, num);
				System.out.println("Appearance: "+ num );
				break;
			default:
				System.exit(0);
			}
			System.out.println("Want to continue (0/1): ");
			choice = sc.nextInt();

		} while (choice == 1);
		sc.close();

	}

}
