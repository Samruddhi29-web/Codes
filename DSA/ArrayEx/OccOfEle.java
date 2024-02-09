import java.util.*;

class OccOfEle{
	public static int occ(int arr[], int x){
		int count = 0;
		for(int i =0; i<arr.length; i++){
			if(arr[i] == x){
				count++;
			}
		}
		return count;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n =  sc.nextInt();
		System.out.println("Enter elements");
		int arr [] = new int[n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find the occ ");

		int x = sc.nextInt();
		System.out.println("The occurrence of "+ x + " is "+ occ(arr,x) + " times");
	}
}

