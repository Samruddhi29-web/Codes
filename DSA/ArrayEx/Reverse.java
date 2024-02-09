import java.util.*;

class Reverse{
	static void swap(int arr[] , int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int [] rev(int [] arr){
		int result [] = arr;
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			swap(arr,i,j);
			i++;
			j--;
		}
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr []= new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int result [] = rev(arr);
		for(int i =0; i<result.length; i++){

			System.out.print(result[i] + " ");
		}
	}
}

