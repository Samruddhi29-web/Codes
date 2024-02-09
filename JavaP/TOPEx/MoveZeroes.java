// Write a Java program to separate zeros from non-zeros in an integer array?

// Moving Zeros To End Of An Array :

import java.util.*;

class MoveZeroes{
	public static void moveZeroes(int arr []){
		int counter = 0;
		for(int i =0; i<arr.length; i++){
			if(arr[i] != 0){
				arr[counter] = arr[i];
				counter++;
			}
		}
		while(counter < arr.length){
			arr[counter] = 0;
			counter++;
		}
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		moveZeroes(arr);
	}
}



