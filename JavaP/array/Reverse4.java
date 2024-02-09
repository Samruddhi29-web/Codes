import java.util.*;
class Reverse4{
	public static void swap(int arr[], int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void rev(int arr[]){
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i=0 ;i<arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		rev(arr);
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
