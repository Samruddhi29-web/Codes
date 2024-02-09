//Check whether the array is sorted or not
import java.util.*;

class SortedOrNot{
	public static boolean sOrNot(int arr []){
		boolean check = true;
		for(int i =1; i<arr.length; i++){
			if(arr[i] < arr[i-1]){
				check = false;
				break;
			}
		}
		return check;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr [] = new int[n];
		for(int i =0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Is sorted : " + sOrNot(arr));
	}
}
