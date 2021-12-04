import java.util.*;

class Subject {
	String name;
	int score;
}

class Student {
	
	// Ŭ���� ����(Static/���� ����)
	// ��������(��� ��ü�� �ϳ��� Ŭ���� ���� ����
 
	static int stdCnt = 0; // �л����� �� ��ü�� ���� ����
	
	String name;
	Subject[] subjectArray;
}

public class ClassArray04 {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # �л� �߰� ���� ��Ʈ�ѷ�
		//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
		//   �̸��� : ����2�� ���� 20 ���� 30 
		//   �̿��� : ����1�� ���� 100
		
		Student [] stdList = new Student[3];
//		int stdCnt = 0;	// �л� ��
		
		while (true) {
			
			// ������ ���� ����� �غ��ô�.
			// Ŭ���� ������ Ŭ������ ���ؼ� ������ �� �ֽ��ϴ�.
//			System.out.println( Student.stdCnt );
			
			for(int i = 0; i < Student.stdCnt; i++ ) {
				System.out.printf("[%d] %s �л�\n", i+1, stdList[i].name );
				
				if( stdList[i].subjectArray != null ) {
					for( int j = 0; j < stdList[i].subjectArray.length; j ++ ) {
						System.out.printf("[%d] %s ���� = %d��\n", 
								j+1, 
								stdList[i].subjectArray[j].name, // i��° �л��� j��° ���� �̸� 
								stdList[i].subjectArray[j].score); // i��° �л��� j��° ���� ����
					}
				}
				System.out.println();
			}
			
			
			System.out.println("[1]�л� �߰��ϱ�");		// �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�");		// �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�");		// �̸��� ���� �׸��� ���� �Է¹޾� �߰�
			System.out.println("[4]�����ϱ�");
			
			System.out.print("����: ");
			int choice = scan.nextInt();
			
			if	(choice == 1) {
				System.out.print("�̸� �Է�: ");
				String name = scan.next();
				
				stdList[Student.stdCnt] = new Student();
				stdList[Student.stdCnt].name = name;
				Student.stdCnt++;
			}
			else if (choice == 2) {
				// ���� ��ϵ� �л� ���
				int number = 0;
				for ( Student stu: stdList ) {
					if ( stu != null ) System.out.printf("[%d] %s\n", ++number, stu.name);
				}
				System.out.print("�л� ����: ");
				int select = scan.nextInt();
				select--;
				
				System.out.print("���� �Է�: ");
				String subject = scan.next();
				if ( stdList[select].subjectArray == null ) {
					// ���� ��ü�� �����ϱ� ���� �迭�� ���� ����
					stdList[select].subjectArray = new Subject[1];
					
					// ���� ��ü�� �����ؼ� �迭�� ����
					stdList[select].subjectArray[0] = new Subject();
					stdList[select].subjectArray[0].name = subject;				
				} else {
					// ���� ���� ������ �����ϴ� �迭�� �̹� �ִٸ� �ڿ� �߰�
					// �迭�� ũ�⸦ Ȯ��
					int size = stdList[select].subjectArray.length;
					
					// ������ �迭�� imsi �޸𸮷� �ٲ��ݴϴ�. 
					Subject [] imsi = stdList[select].subjectArray;
					
					// ������ ������ �迭�� ũ�⸦ �÷��ֱ� ���ؼ� 
					// �迭�� ���� ����
					stdList[select].subjectArray = new Subject[size + 1];
					
					//������ ���� ������ ���ο� �迭�� ����
					for(int i = 0; i < size; i++) {
						stdList[select].subjectArray[i] = imsi[i];
					}
					
					// �׸��� ���� �Է¹��� ���� ������ �� �������� �߰�
					stdList[select].subjectArray[size] = new Subject();
					stdList[select].subjectArray[size].name = subject;
				}
			}
			else if (choice == 3) {
				
				
			}			
		}	
	}
}