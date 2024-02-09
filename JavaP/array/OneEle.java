import java.util.*;

class OneEle{
	public static void oneOcc(int arr []){
		int n = arr.length;
		for(int i =0 ;i<arr.length; i++){
			int count = 0;
			for(int j =1; j<n-1; j++){
				if(arr[i] != arr[j]){
					count++;
				}
			}
			if(count == 1){
				System.out.print(arr[i] + " ");
			}
		}
	}


	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elememts ");
		int arr [] = new int [n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		oneOcc(arr);
	}
}

