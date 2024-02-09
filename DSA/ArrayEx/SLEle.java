//smallest and largest element of array
import java.util.*;

class SLEle{
	public static int[] sl(int arr[]){
		Arrays.sort(arr);
		int ans [] = {arr[0] , arr[arr.length-1]};
		return ans;
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
		int ans[] = sl(arr);
		System.out.println("Smallest = " + ans[0]);
		System.out.println("Largest = " + ans[1]);
	}
}

