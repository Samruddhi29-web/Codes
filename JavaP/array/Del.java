import java.util.*;

class Del{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int [n];
		for(int i= 0;i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter position from which you want to delete an element");
		int pos = sc.nextInt();
		if(pos < 0 || pos > n){
			System.out.println("Invalid position");
		}else{
			for(int i = pos-1; i< n-1 ; i++){
				arr[i] = arr[i+1];
			}
			n--;
			System.out.println("Array after deleting element ");
			for(int i =0; i<n ;i++){
				System.out.print(arr[i] + " ");
			}
		}
	}
}



