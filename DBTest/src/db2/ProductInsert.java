package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductInsert {

	public static void main(String[] args) {
		try {
			//DB연결
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB 연결 성공!");
			}
			
			//DB연결 완료
			
			//저장할 데이터
			String prdNo = "1016";
			String prdName = "스마트폰";
			int prdPrice = 1000000;
			String prdMaker = "삼성";
			String prdColor = "흰색";
			String ctgNo = "2";
			
			//sql 문 작성
			String sql = "insert into product values(?,?,?,?,?,?)";
			
			// sql 전달할 pstmt 객체 생성
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,prdNo);
			pstmt.setString(2,prdName);
			pstmt.setInt(3,prdPrice);
			pstmt.setString(4,prdMaker);
			pstmt.setString(5,prdColor);
			pstmt.setString(6,ctgNo);
			
			// 쿼리문 실행 executeUpdate()
			int result = pstmt.executeUpdate(); 
			
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
