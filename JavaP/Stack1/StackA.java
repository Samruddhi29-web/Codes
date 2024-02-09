//copy contents of one stack into another stack
 
import java.util.*;
public class StackA{
	public static void main(String [] args){
		Stack <Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size ");
		int n = sc.nextInt();
		System.out.println("Enter elements ");
		for(int i=1; i<=n ; i++){
			int x = sc.nextInt();
			st.push(x);
		}
		System.out.println("Stack = "+ st);
		
		Stack <Integer> gt = new Stack <>();
		while(st.size()>0){
			gt.push(st.pop());
		}
		System.out.println("Stack2 = "+ gt);
		Stack <Integer> qt = new Stack<>();
		while(gt.size()>0){
			qt.push(gt.pop());
		}
		System.out.println("Copied Stack = " + qt);

	}
}


