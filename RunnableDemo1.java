class Runnable1 implements Runnable{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.print("@");
			}
		}
}

class Runnable2 implements Runnable{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.print("$");
			}
		}
}

public class RunnableDemo1{
	public static void main(String args[]){
		Runnable1 r1 = new Runnable1();
		Runnable2 r2 = new Runnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}