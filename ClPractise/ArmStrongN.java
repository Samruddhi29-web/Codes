class ArmStrongN{
	public static void main(String [] args){
		int n = 153;
		int temp1 = n;
		int temp2 = n;
		int sum = 0;
		int count = 0;
		while(temp1 != 0){
			count++;
			temp1 = temp1/10;
		}
		while(temp2 != 0){
			int rem = temp2 % 10;
			int mult = 1;
			for(int i =1; i<=count; i++){
				mult = mult * rem;
				
		
			}
			sum = sum + mult;
			temp2 = temp2 / 10;
		}
		if(sum == n){
			System.out.println(n + " is ArmStrong number");
		}else{
			System.out.println(n +" is not ArmStrong number");
		}
	}
}

