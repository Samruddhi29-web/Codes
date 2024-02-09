import java.util.*;
//Check the number is present or not and its frequency
class FreEle{
	public static int[] preOrNot(int arr [] ){
		int fre [] = new int[10005];
		for(int i=0; i<arr.length; i++){
			fre[arr[i]]++;
		}
		return fre;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr [] = new int[n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int fre [] = preOrNot(arr);

		System.out.println("Enter nu8mber of queries");
		int q = sc.nextInt();
		while(q >0){
			System.out.println("Enter number to be searched");
			int x = sc.nextInt();
			if(fre[x] > 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			q--;
		}
	}
}
