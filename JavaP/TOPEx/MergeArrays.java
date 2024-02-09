
//How to merge two sorted arrays in Java?
import java.util.*;

class MergeArrays{
	public static int[] mergeArray(int arr1 [], int arr2 []){
		int [] mergedA = new int[arr1.length + arr2.length];
		int i =0, j= 0, k =0;
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] < arr2[j]){
				mergedA[k] = arr1[i];
				k++;
				i++;
			}else{
				mergedA[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i < arr1.length){
			mergedA[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length){
			mergedA[k] = arr2[j];
			j++;
			k++;
		}
		return mergedA;
	}

	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array Elements");
		int arr1 [] = new int[n];
		for(int i =0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter array2 size");
		int m = sc.nextInt();
		System.out.println("Enter arra2 Elements");
		int arr2 [] = new int[m];
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}

		int arr3 [] = mergeArray(arr1,arr2);
		for(int i =0; i<arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}

	}
}
