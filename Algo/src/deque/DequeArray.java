package deque;

import java.util.ArrayDeque;
import java.util.Deque;

//java.util.Deque �������̽��� ArrayDeque�� ���� 
public class DequeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		
		System.out.println("������ 4�� ����");
		dq.add("����");
		System.out.println(dq);
		dq.add("��");
		System.out.println(dq);
		dq.add("����");
		System.out.println(dq);
		dq.offer("���");
		System.out.println(dq); //[����, ��, ����, ���]
		
		System.out.println("\n���ʿ� ����");
		dq.addFirst("�ٳ���");
		System.out.println(dq); //[�ٳ���, ����, ��, ����, ���]
		
		System.out.println("\n����");
		dq.add("������");
		System.out.println(dq); //[�ٳ���, ����, ��, ����, ���, ������]
		dq.addLast("������"); // ==add()
		System.out.println(dq); // ������ �� ���� ����
		
		System.out.println("\npeek ����:"+ dq.peek());
		System.out.println("\n��ũ ������: "+ dq.size()); // ���� �����ͼ�
		
		System.out.println("\n��ũ ��ȸ");
		for(String item : dq) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n������ ������");
		System.out.println("remove :" + dq.remove());
		System.out.println(dq); //[����, ��, ����, ���, ������, ������]
		
		//ã�Ƽ� ����
		System.out.println("��� remove :" + dq.remove("���"));	
		System.out.println(dq);
		
		System.out.println("���� remove : " + dq.remove("����")); //false
		System.out.println(dq);
		
		System.out.println("\n���ʿ� ����");
		dq.addFirst("������");
		System.out.println(dq);
		
		System.out.println("������ remove : " + dq.remove("������"));
		System.out.println(dq); // 3���߿� �� �տ� 1���� ����
		
		System.out.println("removeAll : "+ dq.removeAll(dq)); //ť ��ü ����
		System.out.println(dq);
	
		System.out.println("������ 4�� ����");
		dq.add("����");
		System.out.println(dq);
		dq.add("��");
		System.out.println(dq);
		dq.add("����");
		System.out.println(dq);
		dq.offer("���");
		System.out.println(dq);

		System.out.println("poll : "+ dq.poll());//����(�Ǿտ� �� ����)
		System.out.println(dq); // [��, ����, ���]
		
		System.out.println("pollFirst : "+ dq.pollFirst());// ==poll�� ���� 
		System.out.println(dq); // [����, ���]
		
		System.out.println("poll : "+ dq.pollLast());
		System.out.println(dq); // [����]

		// ��ũ�� ����ó�� ����Ҷ�
		dq.push("��"); // addFirst�� ����
		dq.push("��");
		System.out.println(dq);
		
		System.out.println("pop ����: "+ dq.pop());
		System.out.println(dq);
		
		
	}

}
