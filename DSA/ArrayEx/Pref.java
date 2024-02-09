import java.util.*;
class Pref{
	public static void pref(int arr []){
		int n = arr.length;
		for(int i = 1; i< n; i++){
			arr[i] = arr[i-1] + arr[i];
		}
		for(int i =0;i<n ;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int n = sc.nextInt();
		System.out.println("Ente arry elements ");
		int arr [] = new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		pref(arr);
	}
}
				
