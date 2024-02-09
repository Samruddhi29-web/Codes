class PerNo{
	public static void main(String [] args){
		int n1 = 1;
		int n2 = 50;
	
		for(int i = n1; i<=n2; i++){
			int sum = 0;
			for(int j= 1; j<i; j++){
				if(i%j == 0){
					sum = sum+j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
	}
}

