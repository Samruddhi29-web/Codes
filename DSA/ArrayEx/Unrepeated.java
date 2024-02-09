//find the element which is unique(unrepeated) [ all elemnts are positive]
import java.util.*;

class Unrepeated{
	public static int unique(int arr []){
		for(int i =0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for(int i =0; i<arr.length; i++){
			if(arr[i] > 0){
				ans = arr[i];
			}
		}
		return ans;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr [] = new int [n];
		for(int i =0; i<arr.length; i++){
			arr[i] =sc.nextInt();
		}
		System.out.println("Unique element = " + unique(arr));
	}
}


