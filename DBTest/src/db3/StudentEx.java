package db3;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DAO 객체 생성하면서 DB 연결
		// 객체 생성될때 생성자 호출되면서 DB 연결됨 
		StudentDAO stdDAO = new StudentDAO();
		
		// (1)학생 데이터 입력
		System.out.println("학생 정보 등록");
		System.out.println("----------------------------");
		
		System.out.print("학번 입력 >");
		String stdkNo = sc.nextLine();
		
		System.out.print("성명 입력 >");
		String stdkName = sc.nextLine();
		
		System.out.print("학년 입력 >");
		int stdkYear = sc.nextInt();
		sc.nextLine();
		
		System.out.print("주소 입력 >");
		String stdkAddress = sc.nextLine();

		System.out.print("생일 입력 >");
		String stdkBirthday = sc.nextLine();
		
		System.out.print("학과번호 입력 >");
		String dptNo = sc.nextLine();
		
		// StudentDTO 객체 생성
		// 생성과 동시에 값저장,  : 생성자 호출하면서 값 전달
		StudentDTO stdDTO = new StudentDTO(stdkNo, stdkName, stdkYear, stdkAddress, stdkBirthday, dptNo);
		stdDAO.insertStudent(stdDTO);
		// StudentDAO 클래스의 insertStudent() 메서드 호출하면서 stdDTO 전달
		
		
		
		
		// (2)학생 정보 조회 : StudentDAO 클래스의 selectStudent() 메서드 호출
		// 객체.메서드
		stdDAO.selectStudent();
		
		
	
	
	
	}

}
