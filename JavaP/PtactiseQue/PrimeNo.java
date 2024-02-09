class PrimeNo{
	public static void main(String [] args){
		int arr [] = new int[]{7,2,9,4,3,11,15,16,19};
		for(int i = 0 ;i<arr.length ; i++){
			int count = 0;
			for(int j =1 ; j<= arr[i] ; j++){
				if(arr[i]%j == 0){
					count++;
				}
			}
			if(count == 2){
				System.out.print(arr[i] + " ");
			}
		}
	}
}

