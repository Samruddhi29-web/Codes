//BruteForce
class SecondL{
	public static void main(String [] args){
		int arr []= new int[]{1,2,4,7,7,5};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		for(int i =0;i<arr.length;i++){
			if(arr[i]>secondLargest && arr[i]!=largest){
				secondLargest = arr[i];
			}
		}
		System.out.println("SecondLargest = " + secondLargest );
	}
}

