class LowUp{
	public static void main(String [] args){
		String str = "This is a Core2Web This is a Core2Web";
		int mid = str.length()/2;

		String lowercase = "";
		String uppercase = "";
		for(int i=0; i<str.length(); i++){
			if(i < mid){
				lowercase = lowercase + Character.toLowerCase(str.charAt(i));
			}
			else{
				uppercase = uppercase + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowercase + uppercase);
	}
}

