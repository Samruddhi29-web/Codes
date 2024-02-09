class Count{
	public static void main(String [] args){
		int arr [] = {34, 3, 567, 12, 1678,14251};
		
		for(int i =0; i<arr.length ;i++){
			int temp = arr[i];
			int count = 0;
			while(temp != 0){
				count++;
				temp = temp/10;
			}
			System.out.println("The number of digits in " + arr[i] +" are "+count);
		}
	}
}

