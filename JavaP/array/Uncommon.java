import java.util.*;
class Uncommon{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr1 [] = new int[n];
		for(int i =0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd array element");
		int m = sc.nextInt();
		System.out.println("Enter arry elements");
		int arr2 [] = new int[m];
		for(int i=0;i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		System.out.println("Uncommon elements :");
		int flag = 0;
		for(int i =0;i<arr1.length;i++){
			for(int j=0; j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					flag = 1;
				}
			}
			if(flag == 0){
				System.out.println(arr1[i]);
			}
			flag = 0;
		}
		for(int i=0 ;i<arr1.length; i++){
			for(int j=0;j<arr2.length; j++){
				if(arr2[i] == arr1[j]){
					flag = 1;
				}
			}
			if(flag == 0){
				System.out.println(arr2[i]);
			}
			flag = 0;
		}
	}
}
			


