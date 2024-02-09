import java.util.*;

class SecMax2{
	public static int firstMax(int arr []){
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<n ;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	public static int secMax(int arr [] ){	
		int max = firstMax(arr);
		for(int i =0; i<arr.length; i++){
			if(arr[i] == max){
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secMx = firstMax(arr);
		return secMx;
	}



	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Second max = " + secMax(arr));
	}
}
