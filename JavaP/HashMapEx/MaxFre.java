import java.util.*;

class MaxFre{
	public static void main(String [] args){
		int arr [] = {2,3,1,7,2,4,5,6,2,3,4};
		Map<Integer, Integer> mp = new HashMap<>();

		for(int i =0; i<arr.length ; i++){
			if(!mp.containsKey(arr[i])){
				mp.put(arr[i] , 1);
			}else{
				mp.put(arr[i] , mp.get(arr[i])+1 );
			}
		}
		System.out.println("Frequency Map");
		System.out.println(mp.entrySet());
		int maxFre = 0;
		int ansKey = -1;
		for(var e : mp.entrySet()){
			if(e.getValue() > maxFre){  
				maxFre = e.getValue();
				ansKey = e.getKey();
			}
		}
		System.out.println(ansKey +" has maximum frequency and it occurs "+ maxFre+ " times");

	}
}

