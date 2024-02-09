class BinaryS{
	public static boolean searchT(int arr [], int target){
		int n = arr.length;
		int st = 0, end = arr.length-1;
		int mid = st + (end-st)/2 ;
		while(st <= end){
			if(target == arr[mid]){
				return true;
			}
			else if(target <arr[mid]){
				end = mid-1;
			}
			else{
				st = mid+1;
			}
		}
		return false;
	}


	public static void main(String [] args){
		int arr [] = {12,25,33,45,52,67,78,89};
		int target = 45;
		System.out.println(searchT(arr,target));
	}
}
