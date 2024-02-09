//count of pairs of targer sum
import java.util.*;
class PairSum{
	public static int pairsum(int arr [], int x){
		int ans = 0;
		for(int i =0; i<arr.length; i++){
			for(int j =i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == x){
					ans++;
				}
			}
		}
		return ans;
	}
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr [] =new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter targer sum");
		int x = sc.nextInt();
		System.out.println("The count of pairs which will give the sum "+ x + " = " + pairsum(arr, x));
	}
}

