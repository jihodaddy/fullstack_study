package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookInsertEx {

	public static void main(String[] args) {
		
		try {
			//DB연결
			// JDBC Driver 클래스의 객체 생성 런타임시 로드
//			Class.forName("com.mysql.cj.jdbc.Driver"); //지금은 이제 안적어도 실행됨
			
			// 연결 주소, 사용자 계쩡, 패스워드 문자열 생성
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB 연결하기 위한 객체 생성
			// DriverManager를 통해 Connection 객체 생성
			// MySQL 서버 연결: 주소, 사용자 계정, 패스워드 전송
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			// Connection 객체가 생성되면 DB연결 성공
			if(con != null) {
				System.out.println("DB 연결 성공!");
			}
			
			//DB연결 완료
			
			//저장할 데이터
			String bookNo ="1016";
			String bookName = "알고리즘";
			String bookAuthor = "김철수";
			int bookPrice = 25000; 
			String bookDate = "2021-10-10";
			int bookStock = 10;
			String pubNo = "1";
			
			//sql 문 작성
			String sql = "insert into book values(?,?,?,?,?,?,?)";
			
			// sql문 values 들어갈 데이터 설정
			// prepare쓰면 위sql에 bookNo,bookName...타입,값을 다 안적어도 됨
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,bookNo);
			pstmt.setString(2,bookName);
			pstmt.setString(3,bookAuthor);
			pstmt.setInt(4,bookPrice);
			pstmt.setString(5,bookDate);
			pstmt.setInt(6,bookStock);
			pstmt.setString(7,pubNo);
			
			// 쿼리문 실행: 영향을 받은 행의 수 반환
			// select: executeQuery() - 결과행 ResultSet 반환
			// insert,update,delete : executeUpdate() - 영향을 받은 행의 수 반환
			int result = pstmt.executeUpdate();  // 행의 수를 반환하기 때문에 int
			
			if(result > 0) {
				System.out.println("데이터 입력 성공!");
			}
			pstmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		} 
		
	}

}
