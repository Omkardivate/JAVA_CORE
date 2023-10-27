package com.oct_25;
import java.util.Scanner;

public class DataDriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		System.out.println("Enter array 1:");
		ArrayOperations.accept(arr);
		
		int option = 0;

		do {
			ArrayOperations.menu();
			
			System.out.print("Enter your choice: ");
			option = sc.nextInt();

			switch (option) {
			case 1:                                      //summation of arrays
				int[][] add = ArrayOperations.addOfArray(arr);
				System.out.println("\nAddition of 2 array: ");
				ArrayOperations.display(add);
				break;
				
			case 2:                                      //transpose array
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
				System.out.print("Appearance of "+ num );
				num=ArrayOperations.Appearance( arr, num);
				System.out.println(": "+ num );
				break;
				
			case 7:
				System.out.println("Thank you...");
				option=7;
				break;
			default:
				System.out.println("Wrong option choosed !!!");;
			}
	

		} while (option != 7);
		sc.close();

	}

}
