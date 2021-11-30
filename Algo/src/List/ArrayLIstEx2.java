package List;

import java.util.ArrayList;
import java.util.List;

//제네릭 타입입 경우
public class ArrayLIstEx2 {

	public static void main(String[] args) {
		//제네릭 String 타입
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("대한민국 만세");
		
		System.out.println("전체 내용 출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " +list.get(i));
		}

		System.out.println("전체 내용 출력");
		for(String item : list) {
			System.out.println(item);
		}
		
		//세 번째 요소와 요소의 길이 출력
		System.out.println("\n세 번째 요소: " + list.get(2));
		System.out.println("세 번째 요소 길이: " + list.get(2).length()); // 글자수
		//네 번째 요소와 요소의 길이 출력(한글)
		System.out.println("\n세 번째 요소: " + list.get(3));
		System.out.println("세 번째 요소 길이: " + list.get(3).length()); //글자수(한글도 동일)
		
		
		//인덱스 2 위치 (세번째) 에 삽입
		list.add(2, "Database");
		// 총 객체 수 출력
		System.out.println("\n총 객체수 : "+ list.size());
		// 전체 내용 출력
		System.out.println("\n전체 내용 출력3");
		for(String item : list) {
			System.out.println(item);
		}
		// JDBC 제거
		list.remove("JDBC");
		// Java 포함 여부
		System.out.println("\nJava 포함 여부");
		System.out.println(list.contains("Java"));
		
		System.out.println("\n전체 내용 출력4");
		for(String item : list) {
			System.out.println(item);
		}
		
	}

}
