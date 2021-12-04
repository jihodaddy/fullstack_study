import java.util.*;
// ������ �𵨷�
// ���� Ŭ����( ����� id, ��������(��ü))
// ����Ŭ���� (���¹�ȣ, �ܾ�)
class Account{
	
}

class User{ // Ŭ���� ����
	// ������ �ִ� �Ӽ� ����
	
	String id;	

	String accountNumber;
	int balance;
	
	User(){
		this.accountNumber = createAccountNumber();
		this.balance = 0;
	}
	//�����ε�
	User(int amount){
		this.accountNumber = createAccountNumber();
		this.balance = amount;
		
	}
	private String createAccountNumber() {
		Random rand = new Random();
//		if(this.accountNumber != null) {
	String account = String.format("%04d-%04d-%04d-%04d",
			rand.nextInt(9999)+1,
			rand.nextInt(9999)+1,
			rand.nextInt(9999)+1,
			rand.nextInt(9999)+1);
		
	return account;
	}

	//��� �߰�(���� ���� ���, ���¹�ȣ�� �ܾ�(�޼���))
	void printAccountInfo() {
		System.out.printf("�����: %s, ���¹�ȣ: %s, �ܾ�: %d\n",
				this.id, this.accountNumber, this.balance);
	}
	//�����
	void deposit(int amount) {
		this.balance += amount;
	}
	void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			this.balance -= amount;
		}
	}
}
class UserEx extends User{
	//�ܾ��� �����ص� ��ݵǵ���
	// �޼��� �������̵�
	//�θ� Ŭ������ �޼��� �̸��� ����
	int creditLevel = 0;
	int depcnt = 0;

	void deposit(int amount) {
		super.deposit(amount);
		//�߰��� ���
		this.depcnt++;
		if(this.depcnt%5==0) creditLevel++;
	}
	
	void withdraw(int amount) {
		if(this.balance < amount && this.creditLevel > 10)	this.balance -= amount;
		else if(this.balance < amount && this.creditLevel <= 10) System.out.println("�ܾ��� �����մϴ�.");
		else balance -= amount;
	}
	void printAccountInfo() {
		System.out.printf("�����: %s, ���¹�ȣ: %s, �ܾ�: %d\n�Ա�Ƚ��: %d, �ſ���:%d\n",
				this.id, this.accountNumber, this.balance, this.depcnt, this.creditLevel);
	}

}

public class ClassVsInstance_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		User[] userList = new User[5];

		for(int i =1; i < userList.length; i++) {
			userList[i] = new User(ran.nextInt(999999));
			userList[i].printAccountInfo();
		}
//		userList[1].deposit(100000000);
//		userList[1].printAccountInfo();
//		
//		userList[2].withdraw(100000000);
//		userList[2].printAccountInfo();
		
		UserEx user01 = new UserEx();
		user01.printAccountInfo();
	
		for(int i = 1; i < 102; i++) {
			int money = ran.nextInt(9999)+1;
		user01.deposit(money);
		}
		
		user01.withdraw(1000000);
		user01.printAccountInfo();
	}

}
