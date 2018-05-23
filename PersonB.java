package bankDemo;

public class PersonB extends Thread {
	// 创建银行对象
	Bank bank;

	// 通过构造器传人银行对象，确保两个人进入的是一个银行
	public PersonB(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		while (Bank.money >= 200) {
			bank.ATM(200);// 每次取200
			try {
				sleep(100);// 取完休息0.1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
