package List;

import java.util.ArrayList;
import java.util.List;

//���׸� Ÿ���� ���
public class ArrayLIstEx2 {

	public static void main(String[] args) {
		//���׸� String Ÿ��
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("���ѹα� ����");
		
		System.out.println("��ü ���� ���");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " +list.get(i));
		}

		System.out.println("��ü ���� ���");
		for(String item : list) {
			System.out.println(item);
		}
		
		//�� ��° ��ҿ� ����� ���� ���
		System.out.println("\n�� ��° ���: " + list.get(2));
		System.out.println("�� ��° ��� ����: " + list.get(2).length()); // ���ڼ�
		//�� ��° ��ҿ� ����� ���� ���(�ѱ�)
		System.out.println("\n�� ��° ���: " + list.get(3));
		System.out.println("�� ��° ��� ����: " + list.get(3).length()); //���ڼ�(�ѱ۵� ����)
		
		
		//�ε��� 2 ��ġ (����°) �� ����
		list.add(2, "Database");
		// �� ��ü �� ���
		System.out.println("\n�� ��ü�� : "+ list.size());
		// ��ü ���� ���
		System.out.println("\n��ü ���� ���3");
		for(String item : list) {
			System.out.println(item);
		}
		// JDBC ����
		list.remove("JDBC");
		// Java ���� ����
		System.out.println("\nJava ���� ����");
		System.out.println(list.contains("Java"));
		
		System.out.println("\n��ü ���� ���4");
		for(String item : list) {
			System.out.println(item);
		}
		
	}

}
