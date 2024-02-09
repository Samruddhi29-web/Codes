class BinaryOcc{
	//Binary search is only for sorted
	public static int binaryS(int arr [] , int target){
		int n = arr.length;
		int st =0, end = arr.length-1;
		int index = -1;
		while(st <= end){
			int mid = st + (end-st)/2;
			if(target == arr[mid]){
				index = mid;
				end = mid -1;
			}
			else if(target < arr[mid]){
				end = mid-1;
			}
			else{
				st = mid + 1;
			}
		}
		return index;
	}
	public static void main(String [] args){
		int arr [] = {2,3,4,5,5,5,6,6,7,8,9};
		int target = 6;
		int result = binaryS(arr,target);
		System.out.println(target +" fount at "+ result +" index");
	}
}

