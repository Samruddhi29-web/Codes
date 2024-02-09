import java.util.*;
class PrefSuffix{
	static int findArraySum(int arr []){
		int totalSum = 0;
		for(int i =0; i<arr.length; i++){
			totalSum = totalSum + arr[i];
		}
		return totalSum;
	}
	static boolean check(int arr [] ){
		int totalSum = findArraySum(arr);
		int prefSum = 0;
		for(int i =0;i<arr.length; i++){
			prefSum = prefSum + arr[i];
			int suffixSum = totalSum - prefSum;
			if(prefSum == suffixSum){
				return true;
			}
		}
		return false;
	}



	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i =0;i <arr.length; i++){
			arr[i] = sc.nextInt();
		}
		boolean c = check(arr);
		System.out.println(c);
	}
}
