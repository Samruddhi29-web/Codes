class Count{
       public static void main(String [] args){
	       long n = 7498726;
	       int count = 0;
	       while(n != 0){
		       count++;
		       n = n / 10;
	       }
	       System.out.println("Count = " + count);
       }
}



