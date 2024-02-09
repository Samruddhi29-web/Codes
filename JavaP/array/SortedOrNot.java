import java.util.*;
// check is the array sorted or not
class SortedOrNot{
	public static boolean isSorted(int arr []){
		int n = arr.length ;
		boolean check = true;
		int i =1; 
		while(i < n){
			if(arr[i] < arr[i-1]){
				check = false;
				break;
			}
			i++;
		}
		return check;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int [n];
		for(int i= 0;i <arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Is sorted : " + isSorted(arr));
	}
}
