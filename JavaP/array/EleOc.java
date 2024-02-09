import java.util.*;

class EleOc{
	public static int countOcc(int arr [], int x){
		int n = arr.length;
		int count = 0;
		for(int i =0; i<n ; i++){
			if(arr[i] == x){
				count++;
			}
		}
		return count;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int [n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to find its occurence");
		int x = sc.nextInt();
		System.out.println("The occurence of "+ x + " is " + countOcc(arr , x)+ " times ");
	}
}
