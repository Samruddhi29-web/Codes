class MaxC{
	public static void main(String [] args){
		String s = "bsbsbccb";
		int arr [] = new int[127];
		for(int i =0; i<s.length()-1 ; i++){
			arr[s.charAt(i)] = arr[s.charAt(i)]+1;
		}
		int max = -1;
		char c = ' ';
		for(int i=0; i<s.length();i++){
			if(max<arr[s.charAt(i)]){
				max = s.charAt(i);
				c = s.charAt(i);
			}
		}
		System.out.println("Maximum reapeted character is " + c);
	}
}



