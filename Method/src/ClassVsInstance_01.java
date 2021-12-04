import java.util.*;
// 은행을 모델로
// 유저 클래스( 사용자 id, 계좌정보(객체))
// 계좌클래스 (계좌번호, 잔액)
class Account{
	
}

class User{ // 클래스 생성
	// 가지고 있는 속성 정의
	
	String id;	

	String accountNumber;
	int balance;
	
	User(){
		this.accountNumber = createAccountNumber();
		this.balance = 0;
	}
	//오버로딩
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

	//기능 추가(고객의 정보 출력, 계좌번호와 잔액(메서드))
	void printAccountInfo() {
		System.out.printf("사용자: %s, 계좌번호: %s, 잔액: %d\n",
				this.id, this.accountNumber, this.balance);
	}
	//입출금
	void deposit(int amount) {
		this.balance += amount;
	}
	void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("잔액이 부족합니다.");
		}else {
			this.balance -= amount;
		}
	}
}
class UserEx extends User{
	//잔액이 부족해도 출금되도록
	// 메서드 오버라이딩
	//부모 클래스의 메서드 이름과 동일
	int creditLevel = 0;
	int depcnt = 0;

	void deposit(int amount) {
		super.deposit(amount);
		//추가된 기능
		this.depcnt++;
		if(this.depcnt%5==0) creditLevel++;
	}
	
	void withdraw(int amount) {
		if(this.balance < amount && this.creditLevel > 10)	this.balance -= amount;
		else if(this.balance < amount && this.creditLevel <= 10) System.out.println("잔액이 부족합니다.");
		else balance -= amount;
	}
	void printAccountInfo() {
		System.out.printf("사용자: %s, 계좌번호: %s, 잔액: %d\n입금횟수: %d, 신용등급:%d\n",
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
