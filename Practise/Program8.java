class OddC{
	public static void main(String [] args){
		long n = 910239773;
		int odd = 0;
		while(n != 0){
			long rem = 0;
			rem = n % 10;
			if(rem%2 != 0){
				odd++;
			}
			n = n/ 10;
		}
		System.out.println("OddCount = " + odd);
	}
}


