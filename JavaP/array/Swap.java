class Swap{
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String [] args){
		int a = 9; 
		int b= 3;
		int arr[] = {2,4,9,6};
		swap(a,b);
	}
}

