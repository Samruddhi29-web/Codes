import java.util.*;

class Lastoc{
	public static int lastIndexOcc(int arr [], int x){
		int n = arr.length;
		int lastIndex = -1;
		for(int i = 0; i<n; i++){
			if(arr[i] == x){
				lastIndex = i;
			}
		}
		return lastIndex;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int [n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find its last occurrence");
		int x = sc.nextInt();
		System.out.println("The lastOccurrence of "+ x + " is at "+ lastIndexOcc(arr,x)  +" index ");

	}
}

				
