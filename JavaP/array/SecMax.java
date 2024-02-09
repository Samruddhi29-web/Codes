import java.util.*;
class SecMax{
	public static int findMax(int arr[]){
		int mx = Integer.MIN_VALUE;
		for(int i= 0; i<arr.length; i++){
			if(arr[i] > mx){
				mx = arr[i];
			}
		}
		return mx;
	}
	public static int findSecMax(int arr[]){
		int mx = findMax(arr);
		for(int i=0 ;i<arr.length; i++){

			if(arr[i] == mx){
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMax = findMax(arr);
		return secondMax;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int[n];
		for(int i= 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(findSecMax(arr));
	}
}

