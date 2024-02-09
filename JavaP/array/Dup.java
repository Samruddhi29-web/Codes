class Dup{
	//remove duplicates from sorted array withusing another array temp
	public static void rem(int arr []){
		int count = 0;
		int n = arr.length;
		int temp [] = new int [n];

		for(int i = 0; i<arr.length-1 ; i++){
			if(arr[i] != arr[i+1]){
				temp[count] = arr[i];
			        count++;
			}
			temp[count] = arr[arr.length-1];
		}
		

		for(int i= 0; i<count; i++){
			System.out.print(temp[i]+ " ");
		}


	}
	

	public static void main(String [] args){
		int arr [] = {1,2,2,3,4,4,5,6};
		rem(arr);
		
		

		
		
	}
}
