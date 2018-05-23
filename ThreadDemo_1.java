package threadDemo;

public class ThreadDemo_1{

	public static void main(String[] args) {
		new TestThread().start();
		TestRunnable tr = new TestRunnable();
		new Thread(tr).start();
		for (int i = 0; i < 20; i++) {
			System.out.println("mian线程在运行");
		}
	}

}

class TestThread extends Thread{
	
	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println("TestThread在运行");
		}
	}
}

class TestRunnable implements Runnable{
	
	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println("TestRunnable在运行");
		}
	}
}