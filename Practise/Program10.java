class Rev{
	public static void main(String [] args){
		long n = 983687213;
		long rev = 0;
		while(n != 0){
			long rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println(" Reverse of 983687213 = " + rev);
	}
}


