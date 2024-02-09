// Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

import java.util.*;

class Pairs{
	public static void pairs(int arr [] ,  int num){
		Arrays.sort(arr);
		System.out.println("Pairs of numbers for sum " + num + " are  : ");
		int i =0;
		int j = arr.length-1;
		while(i<j){
			if(arr[i] + arr[j] == num){
				System.out.println(arr[i] + " + " + arr[j] + " = " + num);
				i++;
				j--;
			}else if(arr[i] + arr[j] < num){
				i++;
			}else if(arr[i] + arr[j] > num){
				j--;
			}
		}
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array Elements");
		int arr [] = new int[n];
		for(int i = 0 ;i <arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number for sum");

		int num = sc.nextInt();
		pairs(arr, num);
	}
}
