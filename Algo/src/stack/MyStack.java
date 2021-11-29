package stack;

public class MyStack {
	//멤버 변수
	private int stackSize;	 // 스택 크기
	private int top;		 // 스택 포인터
	private char[] stackArr; // 스택(배열)
	
	//생성자: 스택 초기화
	// 배열 index는 0부터 시작하므로
	//  top 초기화는 -1 로 설정
	
	public MyStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize; 			// 스택 크기 설정
		stackArr = new char[this.stackSize];	// 스택 배열 생성
	}
	//메서드
	
	//스택이 비었는지 확인하는 isEmpty()
	// 결과 반환: true/ false
	
	public boolean isEmpty() {
		return top == -1;	// top이 -1이면 true 아니면 false반환
	}
	
	//스택이 가득 차있는지 확인하는 isFull()
	// 결과 반환: true / flase
	// 스택이 가득 차있으면 true 반환
	// stackSize : 5
	// 스택 index : 0,1,2,3,4

	public boolean isFull() {
		return top == stackSize - 1;	
		//top이 스택 크기 5와 같으면(마지막 인덱스이면) true 반환
	}
	
	//스택에 데이터를 삽입하는 push()
	// (1) 삽입하기 전에 Overflow 발생하는지 확인: isFull() 호출해서 결과 받아서 확인
	// (2) Full이 아니며 top을 하나 증가한 위치에 데이터 삽입: ++top
	// 삽입하기 위한 데이터를 매개변수 받음
	// 직접 스택에 삽입하고 종료 -> 반환값은 없음
	public void push(char item) {
		if(isFull()) {
		System.out.println("Stack Full. Overflow");
		}else {
			//초기값이 -1이므로 push 할 때 먼저 1증가
			stackArr[++top] = item;
		}
	}
	
	//스택에서 데이터를 삭제하는 pop()
	// (1) 데이터 삭제하기 전에 스택이 비었는데 (Underflow 발생하는지)
	//		:isEmpty() 호출해서 결과 받음
	// Empty가 아니면 top위치의 데이터 삭제
	// 삭제 후 top를 1 감소 시켜 : top--
	// 삭제한 문자를 반환
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack Empty.");
			return 'E'; // 형식적으로 반환
		}else {
			// top 위치에 있는 데이터 반환하고 top을 1감소
			return stackArr[top--];
		}
	}
	
	//스택의 최상위 데이터를 출력하는 peek()
	// (1) 먼저 스택이 비었는지 확인
	// (2) 최상위 데이터 (top위치에 있는 데이터) 반환
	// 최상위 데이터(문자) 반환하므로 반환형 있음
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack Empty. Underflow");
			return 'E'; // 형식적으로 반환
		}else {
			// 현재 최상위 위치 (top의 위치)의 값 반환
			return stackArr[top];
		}
	}
	
	// 스택 내용을 비우는 clear()
	// 스택 초기화: top = -1로 설정
	public void clear() {
		// top을 -1로 초기화
		top  =-1 ;
	}
	
	// 스택의 전체 내용을 출력하는 showStack()
	// 출력만 하고 반환값 없음
	// 먼저 출력하기 전에 스택이 비었는지 확인
	// 스택에 있는 모든 요소의 값 출력(배열의 모든 요소의 값 출력)
	public void showStack() {
		if(isEmpty()) {
			System.out.println("Stack Empty.");
		}else {
			System.out.print("Stack item : ");
			for(int i=0; i<=top; i++) {
				System.out.print(i + ";" + stackArr[i] + " ");
			}
			System.out.print("\ntop : " + top);
		}
	}

}