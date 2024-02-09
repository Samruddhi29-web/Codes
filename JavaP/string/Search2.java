class Search2{
	public static void main(String [] args){
		String arr [] = {"C#","Python","Java","Ruby","Php","Javascript","C++"};
		String target = "Java";
		
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(target)){
				index = i;
				break;
			}
		}
		if(index != -1){
			System.out.println(target+" found at "+ index+ " index");
		}
		else{
			System.out.println("String not found in the array ");
		}
	}
}

			


