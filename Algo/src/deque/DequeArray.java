package deque;

import java.util.ArrayDeque;
import java.util.Deque;

//java.util.Deque 인터페이스를 ArrayDeque로 구현 
public class DequeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		
		System.out.println("데이터 4개 삽입");
		dq.add("포도");
		System.out.println(dq);
		dq.add("배");
		System.out.println(dq);
		dq.add("수박");
		System.out.println(dq);
		dq.offer("사과");
		System.out.println(dq); //[포도, 배, 수박, 사과]
		
		System.out.println("\n앞쪽에 삽입");
		dq.addFirst("바나나");
		System.out.println(dq); //[바나나, 포도, 배, 수박, 사과]
		
		System.out.println("\n삽입");
		dq.add("복숭아");
		System.out.println(dq); //[바나나, 포도, 배, 수박, 사과, 복숭아]
		dq.addLast("복숭아"); // ==add()
		System.out.println(dq); // 동일한 값 삽입 가능
		
		System.out.println("\npeek 수해:"+ dq.peek());
		System.out.println("\n데크 사이즈: "+ dq.size()); // 현재 데이터수
		
		System.out.println("\n데크 순회");
		for(String item : dq) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n데이터 꺼내기");
		System.out.println("remove :" + dq.remove());
		System.out.println(dq); //[포도, 배, 수박, 사과, 복숭아, 복숭아]
		
		//찾아서 삭제
		System.out.println("사과 remove :" + dq.remove("사과"));	
		System.out.println(dq);
		
		System.out.println("딸기 remove : " + dq.remove("딸기")); //false
		System.out.println(dq);
		
		System.out.println("\n앞쪽에 삽입");
		dq.addFirst("복숭아");
		System.out.println(dq);
		
		System.out.println("복숭아 remove : " + dq.remove("복숭아"));
		System.out.println(dq); // 3개중에 맨 앞에 1개만 삭제
		
		System.out.println("removeAll : "+ dq.removeAll(dq)); //큐 전체 삭제
		System.out.println(dq);
	
		System.out.println("데이터 4개 삽입");
		dq.add("포도");
		System.out.println(dq);
		dq.add("배");
		System.out.println(dq);
		dq.add("수박");
		System.out.println(dq);
		dq.offer("사과");
		System.out.println(dq);

		System.out.println("poll : "+ dq.poll());//포도(맨앞에 값 삭제)
		System.out.println(dq); // [배, 수박, 사과]
		
		System.out.println("pollFirst : "+ dq.pollFirst());// ==poll과 동일 
		System.out.println(dq); // [수박, 사과]
		
		System.out.println("poll : "+ dq.pollLast());
		System.out.println(dq); // [수박]

		// 데크를 스택처럼 사용할때
		dq.push("밤"); // addFirst와 동일
		dq.push("밤");
		System.out.println(dq);
		
		System.out.println("pop 수행: "+ dq.pop());
		System.out.println(dq);
		
		
	}

}
