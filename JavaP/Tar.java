import java.util.*;
class Tar{
	public static int PairSum(int arr [] , int target){
		int n = arr.length;
		int ans = 0 ;

		for(int i=0; i<n; i++){
			for(int j = i+1; j<n ; j++){
				if(arr[i]+arr[j] == target){
					ans++;
				}
			}
		}
		return ans;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int  arr [] = new int[n];
		System.out.println("Enter array elements : ");
		for(int i= 0; i< arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target sum : ");
		int target = sc.nextInt();
		System.out.println(PairSum(arr,target));

		


	}
}


