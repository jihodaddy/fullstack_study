package stack;

public class MyStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ũ�� ����
		int stackSize = 5;
		MyStack stk = new MyStack(stackSize);
		
		System.out.print("���� �ʱ� ���� : ");
		stk.showStack(); // ���� �ʱ� ���� : Stack Empty
		
		System.out.println("\npop ����");
		stk.pop();
		
		System.out.println("/na, b, c push ����");
		stk.push('a');
		stk.push('b');
		stk.push('c');
		stk.showStack();
		
		System.out.println("\n�ֻ��� ��: " + stk.peek());
		// �ֻ��� �� : c
		System.out.println("/nd, e push ����");
		stk.push('d');
		stk.push('e');
		stk.showStack();
		// Stack item : 0;a 1;b 2;c 3;d 4;e 
		
		System.out.println("/nf push ����");
		stk.push('f');
		
		System.out.println("\npop 2�� ����");	
		System.out.println("pop �� �� : "+ stk.pop());
		System.out.println("pop �� �� : "+ stk.pop());
		stk.showStack();
		// pop�Ѱ� : e
		// pop�Ѱ� : d
		// Stack item : 0;a 1;b 2;c 
		// top : 2
		
		System.out.println("\nclear ����");
		stk.clear();
		stk.showStack(); // Stack Empty.
		
		System.out.println("\npop ����");
		stk.pop(); // Stack Empty.
		
		System.out.println("\n push ����");
		stk.push('h');
		stk.showStack();
		// Stack item : 0;h 
		// top : 0
		
	}

}
