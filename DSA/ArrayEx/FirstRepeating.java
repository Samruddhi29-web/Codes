import java.util.*;

class FirstRepeating{
	public static int fRepeating(int arr []){
		int n = arr.length;
		for(int i =0; i<n ;i++){
			for(int j=i+1; j<n; j++){
				if(arr[i] == arr[j]){
					//if this condition becomes true then it returns arr[i] , if 
					//ones the return statement becomes true then it stops the method's work;
					//therefore ones arr[i] returns this mwthod never execute after this return statement
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr [] = new int [n];
		for(int i =0;i <arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("First repeating element = " + fRepeating(arr));
	}
}
