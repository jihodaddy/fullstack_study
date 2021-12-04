import java.util.*;

class Ex03{

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� �����ϴ� �޼���
	// �� 1) 87, 11, 92, 14, 47

	void setRandomValuesinArray(int [] scores) {
		for(int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
	}

	// ����2) �������� ������ ��� ����ϴ� �޼���
	// �� 2) ����(251) ���(50.2)
	void printSumAndAverage (int [] scores) {
		int total = 0;
		float avg = 0;
		for(int i = 0; i < scores.length; i++ ) {
			total += scores[i];
		}
		avg = total / (float)scores.length;
		System.out.printf("����(%d) ���(%.2f)\n", total, avg);
	}
	
	// ����3) ������ 60�� �̻��̸� �հ��̸� �հݻ� ���� ����ϴ� �޼���
	// �� 3) 2��
	void printWinner (int [] scores) {
		int cnt = 0;
		for(int i =0; i< scores.length; i++) {
			if(scores[i] >= 60) { cnt++;}
		}
		System.out.printf("�հ��ڼ�: %d\n", cnt);
	}

	// ����4) �ε����� �Է¹޾� ���� ����ϴ� �޼���
	// ����4) �ε��� �Է� : 1 ���� : 11��
	void printScore1 (int [] scores) {
		System.out.print("�ε���: ");
		int n = scan.nextInt();
		System.out.println(scores[n]);
	}

	// ����5) ������ �Է¹޾� �ε��� ����ϴ� �޼���
	// ����5) ���� �Է� : 11 �ε��� : 1
	void printScore2 (int [] scores) {
		System.out.print("�����Է�: ");
		int s = scan.nextInt();
		for(int i = 0; i < scores.length; i ++) {
			if(scores[i] == s) {
				System.out.println(i);
			}
		}
	}

	// ����6) �й��� �Է¹޾� ���� ����ϴ� �޼��� // ��, �����й� �Է� �� ����ó��
	// ��, �����й� �Է� �� ����ó��
	// ����6) �й� �Է� : 1003 ���� : 45��
	
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.print("�й� �Է�: ");
		int hak = scan.nextInt();
			boolean flag = true;
			for(int i = 0; i < hakbuns.length; i++) {
				if(hakbuns[i]==hak) {
					System.out.printf("����: %d\n", scores[i]);
					flag = false;
					}
			}
			if(flag) {System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");}
	}
	
	// ����7) 1���л��� �й��� ���� ����ϴ� �޼���
	// ����7) 1004��(98��)

	void printNumberOne (int [] hakbuns, int [] scores) {
		int maxhakbun = 0;
		int maxscore = 0;
		for(int i = 0; i< scores.length; i++) {
			if(scores[i]>maxscore) {
				maxscore = scores[i];
				maxhakbun = hakbuns[i];
			}
		}
		System.out.printf("%d�� ( %d�� )\n", maxhakbun, maxscore);
	}
}	
	public class Method03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex03 e = new Ex03();
		
		e.setRandomValuesinArray(scores);
		e.printSumAndAverage(scores);
		e.printWinner(scores);
//		e.printScore2(scores);
//		e.printScore3(hakbuns, scores);
		e.printNumberOne(hakbuns, scores);
		
	}

}
