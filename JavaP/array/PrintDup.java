//Print duplicate elements of array
import java.util.*;

class PrintDup{
	public static void dup(int arr []){
		int n =  arr.length; 
		int index = 0;
		for(int i =0; i<n-1; i++){
			for(int j = i+1; j< n; j++){
				if(arr[i] == arr[j]){
					System.out.print(arr[i] +  " ");
					break;
				}
				
			}
		}
		//arr[index] = arr[n-1];
		/*for(int i =0; i<index ; i++){
			System.out.print(arr[index] + " ");
		}*/
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i =0; i<arr.length ;i++){
			arr[i] = sc.nextInt();
		}
		dup(arr);
	}
}
