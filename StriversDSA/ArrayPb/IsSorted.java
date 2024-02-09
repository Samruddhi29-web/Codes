//check whether the array is sorted or not
import java.util.*;
class IsSorted{
	public static boolean sorted(int arr []){
		int n =arr.length;
		for(int i = 0;i<n-1;i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter array elements : ");
		int arr [] = new int[n];
		for(int i =0;i<n;i++){
			arr[i] =sc.nextInt();
		}
		if(sorted(arr)){
			System.out.println("Array is sorted ");
		}else{
			System.out.println("Array is not sorted ");
		}
	}
}

