import java.util.*;

class EqualOrNot{
					
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter first array Elements");
		int arr1 [] = new int[n];
		for(int i =0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter second array Elements");
		int arr2 [] = new int [n];
		for(int i =0; i<arr2.length ;i++){
			arr2[i] = sc.nextInt();
		}
		boolean eq = true;

		if(arr1.length == arr2.length){
			for(int i =0; i<arr1.length ; i++){
				if(arr1[i] != arr2[i]){
					eq = false;
				}
			}
		}
		else{
			eq = false;
		}

		if(eq){
			System.out.println("Arrays are equal");
		}
		else{
			System.out.println("Arrays are not equal");
		}
		
	}
}
