class Pat6{
	public static void main(String [] args){
		int n = 4;
		int num = 1;
		for(int i=1; i<=n ;i++){
			for(int j =1; j<= n-i+1; j++){
				if(j%2 != 0){
					System.out.print(num + " ");
				}
				else{
					System.out.print(num*num + " ");
				}
				num++;
			}
			System.out.println();
		}
	}
}


