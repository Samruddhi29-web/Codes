class Missing{
	public static void main(String [] args){
		int arr [] = {1,2,3,4,5,6,7,9,10};
		int sum = (10*11)/2; // to find sum of first n numbers formula is (n * n+1)/2
		int arrsum = 0;
		for(int i= 0; i<arr.length ;i++){
			arrsum = arrsum + arr[i];
		}
		System.out.println("Missing number = " + (sum-arrsum));
	}
}

