import java.util.*;

class PrefRange{
	static int [] pref(int arr []){
		for(int i = 1; i<arr.length; i++){
			arr[i] = arr[i-1] + arr[i];
		}
		return arr;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n+1];
		for(int i =1;i<=n ; i++){
			arr[i] = sc.nextInt();
		}
		
		int prefSum [] = pref(arr);
		System.out.println("Enter queries");
		int q = sc.nextInt();
		while(q-- > 0){
			System.out.println("Enter range ");
			int l = sc.nextInt();
			int r  =sc.nextInt();
			int ans = prefSum[r] - prefSum[l-1];
			System.out.println("Sum = " + ans);
		}


	}
}
