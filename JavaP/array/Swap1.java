class Swap1{
	public static void swap(int a, int b){
		a = a+b; 
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String [] args){
		int a = 9;
		int b= 3;
		swap(a,b);
	}
}
