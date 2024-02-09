import java.util.*;

class MinMax{
	public static int MinEle(int arr [] ){
		int min = arr[0];
		for(int i =0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	public static int MaxEle(int arr []){
		int max = arr[0];
		for(int i= 0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Elements");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Minimum = "+ MinEle(arr));
		System.out.println("Maximum = "+ MaxEle(arr));
	}
}
