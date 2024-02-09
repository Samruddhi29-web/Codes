class RevEle{
	public static void main(String [] args){
		int arr [] = {23,456,16,789,2564,97432};
		for(int i=0; i<arr.length; i++){
			int temp = arr[i];
			int rem = 0;
			int rev = 0;
			while(temp != 0){
			        rem = temp%10;
			        rev = rev * 10 + rem;
				temp = temp/10;
			}
			System.out.println("Reverse of "+ arr[i] +" is "+rev);
		}
	}
}

