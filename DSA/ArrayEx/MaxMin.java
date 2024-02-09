import java.util.*;
//import java.io.*;

class MaxMin{
	static int getMin(int [] arr, int m){
		int minEle = arr[0];
		for(int i =1; i<m; i++){
			minEle = Math.min(minEle ,arr[i]);
		}
		return minEle;
	}
	static int getMax(int []  arr, int m){
		int maxEle = arr[0];
		for(int i =1; i<m; i++){
			maxEle = Math.max(maxEle, arr[i]);
		}
		return maxEle;
	}
		
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter Elements");
		int arr [] = new int[n];
		int m = arr.length;
		for(int i =0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		System.out.println("Minimum number  = "+ getMin(arr,m));
		System.out.println("Maximum number = "+ getMax(arr,m));
	}
}

