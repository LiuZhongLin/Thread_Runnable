package bankDemo;

public class Bank {
	// 假设一个账户有1000块钱
	static int money = 1000;

	// 柜台Counter取钱的方法
	public void Counter(int money) {
		Bank.money -= money;
		System.out.println("A取走了" + money + "还剩下" + (Bank.money));
	}

	public void ATM(int money) {
		Bank.money -= money;
		System.out.println("B取走了" + money + "还剩下" + (Bank.money));
	}
}
