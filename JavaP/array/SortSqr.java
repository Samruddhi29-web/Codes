import java.util.*;

class SortSqr{
	public static int[] sortedSquares(int arr []){
		int n = arr.length;
		int result [] = new int [n];
		int left = 0, right = n-1 , index = n-1;

		while(left <= right){
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];

			if(leftSquare >= rightSquare){
				result[index--] = leftSquare;
				left++;
			}
			else{
				result[index--] = rightSquare;
				right--;
			}
		}
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter array elements");
		int arr [] = new int[n];
		for(int i =0; i<arr.length ;i++){
			arr[i] = sc.nextInt();
		}
		int [] result = sortedSquares(arr);
		System.out.println("Sorted Squared array ");
		for(int i = 0 ;i<result.length ; i++){
			System.out.print(result[i] + " ");
		}
	}
}

