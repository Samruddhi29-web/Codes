//find smllest and largest element of array
import java.util.*;

class MinMaxEle{
	public static int[] minMax(int arr []){
		Arrays.sort(arr);
		int ans [] = {arr[0], arr[arr.length-1]};
		
		return ans;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int ans [] = minMax(arr);
		System.out.println("Smallest element = "+ ans[0]);
		System.out.println("Largest element = "+ ans[1]);
	}
}
	
