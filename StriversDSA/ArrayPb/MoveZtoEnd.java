class MoveZtoEnd{
	public static void main(String [] args){
		int arr [] = new int[]{11,23,45,0,76,0,12,56,0};
		int j = -1;
		for(int i =0;i<arr.length;i++){
			if(arr[i] == 0){
				j = i;
				break;
			}
		}
		for(int i = j+1;i<arr.length;i++){
			if(arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.println();
	}
}

