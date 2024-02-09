import java.util.*;
class Dup1{
	//remove duplicates from sorted array withput usint another aaray
	public static void remDup(int arr []){
		int count = 0;
		for(int i= 0;i<arr.length-1;i++){
			if(arr[i] != arr[i+1]){
				arr[count] = arr[i];
				count++;
			}
			
		}
		arr[count++] = arr[arr.length-1];
		for(int i =0; i<count ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("Count = " + (count));
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n =  sc.nextInt();
		System.out.println("Enter array elements :");
		int arr [] = new int[n];
		for(int i=0 ;i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		remDup(arr);
	}
}

		
