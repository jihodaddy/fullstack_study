package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<String> q= new LinkedList<String>();
		
		//ť�� �� �߰�
		System.out.println("ť�� 4�� �� ����");
		q.offer("ȫ�浿");
		q.offer("�̸���");
		q.offer("������");
		q.offer("��ö��");
	
		System.out.println("\nť�� ���� ���");
		System.out.println(q); //[ȫ�浿, �̸���, ������, ��ö��]
		System.out.println(q.toString()); //[ȫ�浿, �̸���, ������, ��ö��]
		
		System.out.println("\nť�� ũ��: "+ q.size()); //ť�� ũ�� : 4(������ ��)
		System.out.println("\npeek ����. ù��° �� ���: "+ q.peek()); // ȫ�浿
		
		System.out.println("\nù ��° �� ����: "+ q.poll());
		System.out.println(q); // [�̸���, ������, ��ö��]
		
		// �Ǵ� remove() ���
		System.out.println("\nù ��°�� ����: "+ q.remove()); //�̸���
		System.out.println(q); // [������, ��ö��]
		
		// remove("�˻���")�� �˻��ؼ� ���� ����
		System.out.println("\n�˻��� �� ����(���� ���): "+ q.remove("���浿")); // false 
		System.out.println(q); // [������, ��ö��]
		System.out.println("\n�˻��� �� ����(ã�����): "+ q.remove("��ö��")); // true 
		System.out.println(q); // [������]
		
		
	}

}
