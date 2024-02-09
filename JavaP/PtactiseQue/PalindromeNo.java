class PalindromeNo{
	public static void main(String [] args){
		int num = 12521;
		int rev = 0;
		int rem;
		int temp = num;
		while(num != 0){
		        rem = temp % 10;
		        rev = rev * 10 + rem;
			temp = temp/10;
		}
		if(num == rev){
			System.out.println(num + " is Palindrome ");
		}else{
			System.out.println(num + " is not Palindrome ");
		}
	}
}



