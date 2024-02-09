import java.util.*;
class Uni{
	public static int UniqueNo(int arr[]){
		int n = arr.length;
		for(int i=0; i<n ;i++){
			for(int j=i+1; j<n; j++){
				if(arr[i] == arr[j]){
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int num = -1;
		for(int i=0 ;i<n ;i++){
			if(arr[i] > 0){
				num = arr[i];
			}
		}
		return num;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter array elements :");
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(UniqueNo(arr));
	}
}
