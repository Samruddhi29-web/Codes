import java.util.Scanner;

class Sear{
	public static void main(String [] args){
		
		int i, n , item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number That how many elements do you want to enter in array");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the lements of aaray:" );
		for(i = 0; i<n; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element : ");
		item = sc.nextInt();
		for( i = 0;i<a.length; i++){
			if(a[i] == item){
				System.out.println("Item is exist at index "+ i);
				break;
			}
		}
		if(i == n){
			System.out.println("Item does'nt exist");
		}
	}
}

		
		

