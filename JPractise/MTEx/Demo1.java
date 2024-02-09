class Demo1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In run");
		}
	}
}
class ThreadDemo{
	public static void main(String[]args){
		Demo1 obj = new Demo1();
		obj.start();
		for(int i=0;i<10;i++){
			System.out.println("In main");
		}

	}
}

