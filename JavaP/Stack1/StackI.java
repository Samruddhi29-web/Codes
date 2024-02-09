//Insert at bottom / any index
import java.util.*;

public class StackI{
	public static void main(String [] args){
		Stack <Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size ");
		int n = sc.nextInt();
		System.out.println("Enter elements ");
		for(int i =1 ; i<=n ;i++){
			int x = sc.nextInt();
			st.push(x);
		}
		System.out.println("Stack1 = " + st);
		System.out.println("Enter index where you want to insert ele ");
		int idx = sc.nextInt();
		System.out.println("Enter element which you want to insert ");
		int a = sc.nextInt();
		Stack <Integer> temp = new Stack<>();
		while(st.size()>idx){
			temp.push(st.pop());
		}
		st.push(a);
		while(temp.size()>0){
			st.push(temp.pop());
		}
		System.out.println("Inserted Stack = "+ st);
	}
}



