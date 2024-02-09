import java.util.*;
//Sort array which contains zeroes and ones
class SortZeroesOnes{
	public static void sort1(int arr []){
		int n = arr.length;
		int zeroes = 0;
		for(int i=0; i<n ;i++){
			if(arr[i] == 0){
				zeroes++;
			}
		}
		for(int i=0;i<n;i++){
			if(i<zeroes){
				arr[i] = 0;
			}else{
				arr[i] = 1;
			}
		}
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array size");
		int arr [] = new int[n];
		for(int i= 0;i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		sort1(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}


