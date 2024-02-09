//Largest number between three numbers
import java.util.*;

class Largest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enrter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int largest = a>b?a:b;
		largest = largest>c?largest:c;
		System.out.println(largest + " is largest element ");
	}
}



