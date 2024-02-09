class Demo3{
	 void fun(){
		new Thread(r1).start();	
	}
	Runnable r1 = ()->{
	System.out.println("in runnable");
	};

	public static void main(String[]args){
		Demo3 obj = new Demo3();
		obj.fun();
	}
}


