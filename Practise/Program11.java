class Pal{
	public static void main(String [] args){
		long num = 2332;
		long temp = num;
		long rev = 0;
		while(temp != 0){
			
			long rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		if(rev == num){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}
	}
}


