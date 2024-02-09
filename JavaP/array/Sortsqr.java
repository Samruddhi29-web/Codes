import java.util.*;

class Sortsqr{
	public static int[] sortSq(int arr []){
		int n = arr.length;
		int index = 0;
		int sortedArray [] = new int [n];
		for(int i =0 ;i<n ;i++){
			sortedArray[i] = arr[i] * arr[i];
		}
		for(int i= 0; i<n-1; i++){
			for(int j =0 ; j<n-i-1 ; j++){
				if(sortedArray[j] > sortedArray[j+1]){
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1]  = temp;
				}
			}
		}
		return sortedArray;
	}
			

	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter array elements");
		int arr [] = new int [n];
		for(int i= 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int result [] = sortSq(arr);
		for(int i=0 ; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
}



