import java.util.*;
class HashDemo{
	public static void HashMapMethods(){
		Map<String, Integer> mp = new HashMap<>();
		mp.put("Aakash",21);
		mp.put("Neha",24);
		mp.put("Harry",27);
		mp.put("Ritu",22);
		mp.put("Kavya",28);
		System.out.println(mp.get("Kavya"));
		System.out.println(mp.get("Siya"));//null cause Siya key is not present in our hashmap
		mp.put("Kavya", 26);
		//System.out.println(mp.get("Kavya"));
		//System.out.println(mp.remove("Aakash"));
		//System.out.println(mp.remove("Riya"));
		//System.out.println(mp.containsKey("Aakash"));
		//System.out.println(mp.containsKey("Harry"));
		/*System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());*/
		for(var key : mp.keySet()){
			System.out.println("Age of "+ key + " is "+ mp.get(key));
		}

		


	}
	public static void main(String [] args){
		HashMapMethods();
	}
}
