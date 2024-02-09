class Pat2{
	public static void main(String [] args){
		for(int i=1; i<=3; i++){
			int num = 1;
			char var = 'A';
			for(int j = 1; j<=4; j++){
				if(j%2 != 0){
					System.out.print(var + " ");
					var++;
				}
				else{
					System.out.print(num + " ");
					num++;
				}
				
				
			}
			System.out.println();
		}
	}
}


