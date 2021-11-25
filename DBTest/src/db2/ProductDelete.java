package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDelete {

	public static void main(String[] args) {

// 삭제할 상품 번호 입력
		Scanner sc = new Scanner(System.in);
		//데이터 입력
		System.out.println("상품 정보 삭제");
		System.out.println("----------------------------");
		
		System.out.print("삭제할 상품번호 입력 >");
		String prdNo = sc.nextLine();
		
// DB연동
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
			
					
//sql 문 작성
		String sql = "delete from product where prdNo=?";
			
// sql 전달할 pstmt 객체 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,prdNo);
			
// 실행 쿼리문
		int result = pstmt.executeUpdate();
		// 결과 출력
		if(result >0) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		sc.close();
		pstmt.close();
		con.close();

			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}		
	}

}
