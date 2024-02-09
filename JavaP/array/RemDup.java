import java.util.*;
class RemDup{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int [n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value which want to remove:");
		int ele = sc.nextInt();
		rem(arr,ele);
		
	}
		
	public static void rem(int arr[], int ele){
			int count = 0;
			int n = arr.length;

			for(int i =0 ;i< arr.length-1 ;i++){
				
				if(arr[i] != ele){
					arr[count++] = arr[i];
				}
			}
			arr[count++] = arr[n-1];
			
			for(int i=0; i<count ;i++){
				System.out.println(arr[i] + " ");
			}
			System.out.println("Count = " + count);
	}
	/*public static void printarray(int arr []){


			for(int i=0; i<arr.length;i++){
				System.out.println(arr[i]);
			}
	}*/
	
}

		
