package stack;

import java.util.Stack;

// java.util.Stack; Ŭ���� ���

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Stack<String> stk = new Stack<String>();
			
			stk.push("ȫ�浿");
			stk.push("�̸���");
			stk.push("������");
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + ":" + stk.get(i));
			}
				// 0:ȫ�浿
				// 1:�̸���
				// 2:������
			
			System.out.println("���� ũ��: " + stk.size());
			System.out.println("�ֻ��� �� : "+ stk.peek());
			System.out.println("�̸��� ����ֳ�? : " + stk.contains("�̸���"));
			System.out.println("pop ����: " + stk.pop());
			System.out.println("pop ����: " + stk.pop());
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + ":" + stk.get(i));
			}
			System.out.println("clear ����");
			stk.clear();
			
			System.out.println("empty? : " + stk.empty());

			System.out.println("pop ����" + stk.pop());
			// ����: java.util.EmptyStackException
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
