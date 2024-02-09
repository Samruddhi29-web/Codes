//Remove Repated elements from sorted the array
import java.util.*;
class Repeating{
	public static void main(String [] args){
		int arr [] = new int[]{1,2,2,3,4,4,5,6,7,7};
		HashSet hs = new HashSet();
		for(int i =0;i<arr.length;i++){
			hs.add(arr[i]);
		}
		System.out.println(hs);
	}
}


