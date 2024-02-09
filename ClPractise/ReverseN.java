class ReverseN{
	public static void main(String [] args){
		long n = 453298695;
		long rev = 0;
		while(n != 0){
			long rem = n % 10;
			rev = rev*10 + rem;
			n = n / 10;
		}
		System.out.println("Reverse = "+ rev);
	}
}

