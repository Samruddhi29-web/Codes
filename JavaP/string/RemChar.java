class RemChar{
	public static void remChar(String s, char d){
		int n = s.length();
		String remCharStr = "";

		for(int i= 0; i<n ;i++){
			if(s.charAt(i) != d){
				remCharStr = remCharStr + s.charAt(i);
			}
		}
		System.out.println("String = " + remCharStr);
	}
	public static void main(String [] args){
		String s = "Samruddhi Shinde";
		
		remChar(s , 'd');
	}
}
