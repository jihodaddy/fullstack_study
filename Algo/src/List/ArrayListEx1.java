package List;

import java.util.ArrayList;
import java.util.List;

//���׸� Ÿ���� �ƴѰ��
public class ArrayListEx1 {

	public static void main(String[] args) {
		List list = new ArrayList(5);
//		List list2 = new LinkedList(); // List�������̽� ���� Ŭ���� ��������
		
		list.add(100);
		list.add(2.55);
		list.add(300);
		list.add(9.9);
		list.add("�ڹ� ���α׷���");
		list.add(1,"�����ͺ��̽�"); // index 1�� ��ġ�� ����
		
		System.out.println("����Ʈ ���� ���");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " +list.get(i));
		}
		
		System.out.println("\n���� ���� Ȯ��");
		System.out.println(list.contains(300));  // true
		System.out.println(list.contains("�ڹ�"));  // false
		
		System.out.println("\n����Ʈ���� ������ ����");
		System.out.println(list.remove(1)); //�ε��� 1(�ι�° ������) ����: 1:�����ͺ��̽�
		System.out.println(list.remove("�ڹ� ���α׷���"));
		
		System.out.println("����Ʈ ���� ���");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " +list.get(i));
		
		}
	}

}
