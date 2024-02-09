class SumE{
	public static void main(String [] args){
		long n = 212296429;
		long sum = 0;
		while(n != 0){
			long rem = n % 10;
			if(rem%2 == 0){
				sum = sum + rem;
			}
			n = n/10;
		}
		System.out.println("Sum = " + sum);
	}
}

