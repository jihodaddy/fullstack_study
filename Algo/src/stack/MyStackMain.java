package stack;

public class MyStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스택 크기 설정
		int stackSize = 5;
		MyStack stk = new MyStack(stackSize);
		
		System.out.print("스택 초기 상태 : ");
		stk.showStack(); // 스택 초기 상태 : Stack Empty
		
		System.out.println("\npop 수행");
		stk.pop();
		
		System.out.println("/na, b, c push 수행");
		stk.push('a');
		stk.push('b');
		stk.push('c');
		stk.showStack();
		
		System.out.println("\n최상위 값: " + stk.peek());
		// 최상위 값 : c
		System.out.println("/nd, e push 수행");
		stk.push('d');
		stk.push('e');
		stk.showStack();
		// Stack item : 0;a 1;b 2;c 3;d 4;e 
		
		System.out.println("/nf push 수행");
		stk.push('f');
		
		System.out.println("\npop 2번 수행");	
		System.out.println("pop 한 값 : "+ stk.pop());
		System.out.println("pop 한 값 : "+ stk.pop());
		stk.showStack();
		// pop한값 : e
		// pop한값 : d
		// Stack item : 0;a 1;b 2;c 
		// top : 2
		
		System.out.println("\nclear 수행");
		stk.clear();
		stk.showStack(); // Stack Empty.
		
		System.out.println("\npop 수행");
		stk.pop(); // Stack Empty.
		
		System.out.println("\n push 수행");
		stk.push('h');
		stk.showStack();
		// Stack item : 0;h 
		// top : 0
		
	}

}
