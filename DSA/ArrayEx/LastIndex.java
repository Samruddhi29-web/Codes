import java.util.*;
//program to find the last occurrence of element
class LastIndex{
	public static int lastOcc(int arr[] , int x){
		int lastIndex = -1;
		for(int i =0; i<arr.length;i++){
			if(arr[i] == x){
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr []= new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element");
		int x = sc.nextInt();
		System.out.println("The last Occurrence of " + x +" is found at index "+ lastOcc(arr,x));
	}
}

