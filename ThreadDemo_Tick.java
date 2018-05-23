package threadDemo;


public class ThreadDemo_Tick extends Thread{
	public ThreadDemo_Tick(String name) {
		super(name);
	}
	// 为了保持票数的一致，票数要静态
	private static int tick = 20;
	// 创建一个静态钥匙,值是任意的
	private static Object ob = "oo";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (tick > 0) {
			// 这个很重要，必须使用一个锁，进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
			synchronized (ob) {
				if (tick > 0) {
					System.out.println(getName()+"卖出了"+tick+"张票");
					tick--;
				}
				else {
					System.out.println("票卖完了");
				}
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
