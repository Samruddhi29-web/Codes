class Rotate{
	public static int [] rotate(int [] arr, int k){
		int n = arr.length;
		k = k%n;
		int [] ans = new int[n];
		int j = 0;
		for(int i=n-k; i<n; i++){
			ans[j++] = arr[i];
		}
		for(int i=0 ; i<n-k; i++){
			ans[j++] = arr[i];
		}
		return ans;
	}
	public static void printArray(int arr [] ){
		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String [] args){
		int arr [] = {3,6,5,9,2};
		int k = 2;
		int ans [] = rotate(arr,k);
		printArray(arr);


	}
}


