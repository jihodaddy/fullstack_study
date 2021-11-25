package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 수정할 정보 입력
		Scanner sc = new Scanner(System.in);
		
			System.out.println("상품 정보 변경");
			System.out.println("--------------------------");
			
			System.out.print("변경할 상품번호 입력>");
			String prdNo = sc.nextLine();
	
			System.out.print("상품명 >");
			String prdName = sc.nextLine();
			
			System.out.print("상품가격 >");
			int prdPrice = sc.nextInt();
			sc.nextLine();
			
			System.out.print("제조사>");
			String prdMaker = sc.nextLine();
			System.out.print("색상 >");
			String prdColor = sc.nextLine();
			System.out.print("카테고리 >");
			String ctgNo = sc.nextLine();

		
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
			String sql = "update product set prdName=?, prdPrice=?, prdMaker=?, prdColor=?, ctgNo=? where prdNo=?";
			
// sql 전달할 pstmt 객체 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,prdName);
		pstmt.setInt(2,prdPrice);
		pstmt.setString(3,prdMaker);
		pstmt.setString(4,prdColor);
		pstmt.setString(5,ctgNo);
		pstmt.setString(6,prdNo);
			
// 쿼리문 실행 executeUpdate()
		int result = pstmt.executeUpdate(); 
		
		if(result > 0) {
			System.out.println("데이터 입력 성공!");
		}
		pstmt.close();
		con.close();
		sc.close();	
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}

}
