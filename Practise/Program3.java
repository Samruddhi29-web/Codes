class Reverse{
	public static void main(String [] args){
		long n = 8640292;
		long rev = 0;
		while( n != 0){
			long a = n %10;
			rev = rev*10  + a;
			n = n / 10;
		}
		System.out.println("Reverse of 8640292 is "+rev);
	}
}

