class Rev{
	public static void swap(int arr[], int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverseArray(int []arr){
		int i=0,j=arr.length-1;
		while(i<j){
			swap(arr,i,j);
				i++;
				j--;
			
		}

	}
	public static void printArray(int arr[]){
		for(int i=0 ;i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String [] args){
		int arr [] = {2,5,9,4,6};
		reverseArray(arr);
		printArray(arr);
	}
}
