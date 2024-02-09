import java.util.*;


class Del{
	public static void main(String [] args){
		int n , loc ;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements ");
		for(int i = 0; i<n ; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter array location from where you want to delete the element ");
		loc = sc.nextInt();
		for(int i = loc; i<n-1; i++){
			a[i]=a[i+1];
		}
		n--;
		for(int i = 0; i<n ; i++){
			System.out.println(a[i] + "  ");
		}
	}
}

