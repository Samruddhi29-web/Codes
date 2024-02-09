class Reverse{
	public static int[] ArrayReverse(int arr[]){
		int n = arr.length;
		int j = 0;
		int ans[] = new int[n];
		for(int i =n-1; i>=0; i--){
			ans[j++] = arr[i];
		}
		return ans;
		
			
		
	}
	public static void main(String [] args){
		int arr[] = {3,5,8,9,4};
		int ans [] = ArrayReverse(arr);
		for(int i= 0; i<ans.length; i++){
			System.out.println(arr[i]);
		}

		
	}
}
