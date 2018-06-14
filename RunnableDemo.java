class Runnable1 implements Runnable{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.print("@");
				try{
					Thread.sleep(50);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
}

class Runnable2 implements Runnable{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.print("$");
				try{
					Thread.sleep(50);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
}

public class RunnableDemo{
	public static void main(String args[]){
		Runnable1 r1 = new Runnable1();
		Runnable2 r2 = new Runnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}