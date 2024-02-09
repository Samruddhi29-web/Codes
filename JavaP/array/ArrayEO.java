class ArrayEO{
	public static void arrayEvenOdd(int arr [] ){
		int a [] = new int [arr.length];
		int index = 0;
		for(int i =0 ;i < arr.length; i++){
			if(arr[i]%2 == 0){
				a[index] = arr[i];
				index++;
			}
		}
		for(int i =0 ; i<arr.length; i++){
			if(arr[i]%2 != 0){
				a[index] = arr[i];
				index++;
			}
		}
		for(int i =0 ;i<a.length ; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		int arr [] = { 24, 56,13, 15, 68, 90, 47};
		arrayEvenOdd(arr);
	}
}
