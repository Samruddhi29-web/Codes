class Demo2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In run ");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException obj){
			}
		}
	}
}
class ThreadDemo{
	public static void main(String[]args){
		Demo2 obj = new Demo2();
		obj.start();

		for(int i =0;i<10 ;i++){
			System.out.println("In main ");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException sam){
			}
		}
	}
}
		
