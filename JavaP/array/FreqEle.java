import java.util.*;
class FreqEle{
	//Frequency of occurrence of element in array
	public static void freEle(int arr [] ){
		int fre = 1;
		int i = 1;
		while(i<arr.length){
			while(i<arr.length && arr[i] == arr[i-1]){
				fre++;
				i++;
			}
			System.out.println(arr[i-1] + " appears " + fre + " times ");
			fre = 1;
			i++;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int arr [] = new int [n];
		for(int i =0 ;i< arr.length; i++){
			arr[i] = sc.nextInt();
		}

		
		Arrays.sort(arr);
		freEle(arr);
	}
}



