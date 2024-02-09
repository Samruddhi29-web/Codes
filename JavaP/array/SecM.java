import java.util.*;
class SecM{
	public static int Max(int arr[]){
		int mx = Integer.MIN_VALUE;
		for(int i= 0;i<arr.length; i++){
			if(arr[i]>mx){
				mx = arr[i];
			}
		}
		return mx;
	}
	public static int secM(int arr[]){
		int mx = Max(arr);
		for(int i=0; i<arr.length; i++){
			if(arr[i] == mx){
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secMax = Max(arr);
		return secMax;
	}


	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size");
		int n =  sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i=0 ;i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Second max number = " + secM(arr));
	}
}
