class Search1{
	public static void main(String [] args){
		String [] arr = {"Java","C++","Python","Ruby","Flutter"};
		String target = "Java";
		for(int i=0; i<arr.length;i++){
			if(arr[i].equals(target)){
				System.out.println(target +" fount at "+ i +" index ");
			}
		}
	}
}

