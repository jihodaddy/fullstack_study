package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<String> q= new LinkedList<String>();
		
		//큐에 값 추가
		System.out.println("큐에 4개 값 삽입");
		q.offer("홍길동");
		q.offer("이몽룡");
		q.offer("성춘향");
		q.offer("김철수");
	
		System.out.println("\n큐의 내용 출력");
		System.out.println(q); //[홍길동, 이몽룡, 성춘향, 김철수]
		System.out.println(q.toString()); //[홍길동, 이몽룡, 성춘향, 김철수]
		
		System.out.println("\n큐의 크기: "+ q.size()); //큐의 크기 : 4(데이터 수)
		System.out.println("\npeek 수행. 첫번째 값 출력: "+ q.peek()); // 홍길동
		
		System.out.println("\n첫 번째 값 삭제: "+ q.poll());
		System.out.println(q); // [이몽룡, 성춘향, 김철수]
		
		// 또는 remove() 사용
		System.out.println("\n첫 번째값 삭제: "+ q.remove()); //이몽룡
		System.out.println(q); // [성춘향, 김철수]
		
		// remove("검색어")는 검색해서 삭제 가능
		System.out.println("\n검색한 값 삭제(없는 경우): "+ q.remove("강길동")); // false 
		System.out.println(q); // [성춘향, 김철수]
		System.out.println("\n검색한 값 삭제(찾은경우): "+ q.remove("김철수")); // true 
		System.out.println(q); // [성춘향]
		
		
	}

}
