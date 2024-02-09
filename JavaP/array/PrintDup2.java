import java.util.*;

class PrintDup2{
	public static void dup(int arr []){
		int n = arr.length;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0; i<arr.length-1;i++){
			for(int j= i+1; j<arr.length;j++){
			       if(arr[i] == arr[j]){
				       set.add(arr[i]);
			       }
			}
		}
		System.out.println("Duplicates = "+ set);
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i =0; i<arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		dup(arr);
	}
}

