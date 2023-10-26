package com.oct_25;
import java.util.Scanner;

public class ArrayOperations {

	public static void accept(int[][] arr)
    {
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<arr.length;i++)
        {
    		for(int j=0;j<arr[0].length;j++) {
    			arr[i][j]= sc.nextInt();
    		}	
        }
    }
	
	public static void display(int[][] arr)
    {
		for(int i=0;i<arr.length;i++)
        {
    		for(int j=0;j<arr[0].length;j++) {
    			System.out.print(arr[i][j] + "\t") ;
    		}
    		System.out.println() ;
        }
    }

	public static int[][] addOfArray(int[][] a,int[][] b)
    {
    	int[][] temp=new int[a.length][a[0].length];
    	for(int i=0;i<a.length;i++)
        {
    		for(int j=0;j<a[0].length;j++) {
    			temp[i][j]= a[i][j] + b[i][j] ;
    		}
        }
        return 	temp;
    }
	
	public static int[][] transpose(int[][] arr)
    {
    	int[][] temp=new int[arr[0].length][arr.length];
		for(int i=0;i<arr[0].length;i++)
        {
    		for(int j=0;j<arr.length;j++) {
    			temp[i][j]=arr[j][i] ;
    		}
        }           
        return temp;
    }
	
	public static void findMin(int[][] a)
    {
		int min=a[0][0];
    	for(int i=0;i<a.length;i++)
        {
    		for(int j=0;j<a[0].length;j++) {
    			if(a[i][j]<min) {
    				min=a[i][j];
    			}
    		}
        }
        System.out.println("minimum element: "+ min);
    }
	
	public static void findMax(int[][] a)
    {
		int max=a[0][0];
    	for(int i=0;i<a.length;i++)
        {
    		for(int j=0;j<a[0].length;j++) {
    			if(a[i][j]>max) {
    				max=a[i][j];
    			}
    		}
        }
        System.out.println("maximum element: "+ max);
    }
	
	public static int Appearance(int[][] arr,int num)
    {
    	int cnt =0;
		for(int i=0;i<arr.length;i++)
        {
    		for(int j=0;j<arr[0].length;j++) {
    			if(arr[i][j]==num) {
    				cnt++;
    			}
    		}
        }           
        return cnt;
    }
	
	public static void menu()
    {
    	System.out.println("1. Addition of 2 array");
    	System.out.println("2. Transpose");
    	System.out.println("3. Min. number from 2D array");
    	System.out.println("4. Max. number from 2D array");
    	System.out.println("5. Display array");
    	System.out.println("6. Nubmer appearance");
    	System.out.println("7. EXIT");
    }
}
