//Given an integer array 'a' sorted in non-decreasing order,return an array of the squares of each number
//sorted in non-decreasing order
import java.util.*;

class SortSquares{
	public static void swap(int arr [] , int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverse(int arr [] ){
		
	  	int i = 0;
		int j = arr.length-1;
		while(i < j){
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static int[] sortSq(int arr []){
		int n = arr.length;
		int left = 0;
		int right = n-1;
		int ans [] = new int[n]; 
		int k = 0;
		while(left <= right){
			if(Math.abs(arr[left]) > Math.abs(arr[right])){
				ans[k++] = arr[left] * arr[left];
				left++;
			}else{
				ans[k++] = arr[right] * arr[right];
				right--;
			}
			
		}
		
		
		return ans;
	}
	public static void printArray(int ans []){
		for(int i =0; i<ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n= sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] =  new int [n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int ans [] = sortSq(arr);
		
		printArray(ans);
		//reverse(ans);
		//printArray(ans);
		
	}
	//Wrong output
}

