import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] unit = {5000, 1000, 500, 100, 50, 10};
	
		System.out.print("�ݾ� �Է�: ");
		int money = sc.nextInt();
		
		for(int i = 0 ; i < unit.length; i ++) {
			System.out.println(unit[i] + "�� : "+ money / unit[i]);
			money %= unit[i];
		}
		System.out.print(" ������ : "+ money);
	}

}
