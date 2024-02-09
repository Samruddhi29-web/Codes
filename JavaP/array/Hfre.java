// Frequency of each element of array usinh Hashmap
import java.util.*;

class Hfre{
	public static void countFre(int arr[] , int n){
		HashMap<Integer, Integer> result = new HashMap<>();
		for(int i=0 ;i<arr.length; i++){
			if(result.containsKey(arr[i])){
				result.put(arr[i],result.get(arr[i])+1);
			}else{
				result.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer, Integer> i : result.entrySet()){
			System.out.println(i.getKey() + " appears "+ i.getValue() + " times");
		}

	}

	public static void main(String [] args){
		int arr [] = new int [] {23, 45, 16, 16, 76, 45,45,23,89};
	        int n = arr.length;
		countFre(arr,n);
	}
}	


