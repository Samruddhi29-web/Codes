//Write a Java program to find the intersection of two arrays
import java.util.*;

class Intersec{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array1 Elements");
		String arr1 [] = new String[n];
		for(int i =0; i<arr1.length; i++){
			arr1[i] = sc.nextLine();
		}
	      	System.out.println("Enter size of array2");
		int m = sc.nextInt();
		String arr2 [] = new String [m];
		System.out.println("Enter array2 Elements");
		for(int i =0; i<arr2.length; i++){
			arr2[i] = sc.nextLine();
		}
		HashSet<String> set = new HashSet<String>();
		for(int i=0 ;i<arr1.length; i++){
			for(int j =0; j<arr2.length; j++){
				if(arr1[i].equals(arr2[j])){
					set.add(arr1[i]);
				}
			}
		}
		System.out.println("Intersection = "+ set);
	}
}


