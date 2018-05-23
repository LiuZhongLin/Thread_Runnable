package threadDemo;

public class MainClass_Tick {
	public static void main(String[] args) {
		ThreadDemo_Tick tdt1 = new ThreadDemo_Tick("窗口1");
		ThreadDemo_Tick tdt2 = new ThreadDemo_Tick("窗口2");
		ThreadDemo_Tick tdt3 = new ThreadDemo_Tick("窗口3");

		tdt1.start();
		tdt2.start();
		tdt3.start();
	}
}
