//Sort zeroes and ones
import java.util.*;

class SortZeroesOnes2{
	public static void swap(int arr [], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void sort2(int arr []){
		int n = arr.length;
		int left = 0;
		int right = n-1;
		while(left < right){
			if(arr[left] == 1 && arr[right] == 0){
				swap(arr, left,right);
				left++;
				right--;
			}
			if(arr[left] == 0){
				left++;
			}
			if(arr[right] == 1){
				right--;
			}
		}
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array size");
		int arr [] = new int [n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		sort2(arr);
	}
}
