class Sum{
	public static void main(String [] args){
		int n = 7352;
		int sum = 0;
		while(n != 0){
			int a = n % 10;
			sum = sum + a;
			n = n/10;
		}
		System.out.println("Sum of digits of number 7352 = " + sum);
	}
}


