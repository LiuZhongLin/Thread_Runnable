package bankDemo;

public class PersonA extends Thread {
	// 创建银行对象
	Bank bank;

	// 通过构造器传人银行对象，确保两个人进入的是一个银行
	public PersonA(Bank bank) {
		this.bank = bank;
	}

	// 重写run方法，实现柜台取钱
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (Bank.money >= 100) {
			bank.Counter(100);// 每次取100块
			try {
				sleep(100);// 取完休息0.1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
