import java.util.*;

class MoveZtoFront{
	public static void moveToFront(int arr [] ){
		int counter = arr.length-1;
		for(int i = arr.length-1 ; i>=0 ; i--){
			if(arr[i] != 0){
				arr[counter] = arr[i];
				counter--;
			}
		}
		while(counter >= 0){
			arr[counter] = 0;
			counter--;
		}
		for(int i =0; i<arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array Elements");
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		moveToFront(arr);
	}
}
