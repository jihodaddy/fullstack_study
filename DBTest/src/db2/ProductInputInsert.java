package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductInputInsert {

	public static void main(String[] args) {

//등록할 정보 입력
		Scanner sc = new Scanner(System.in);
		
			System.out.println("상품 정보 입력");
			System.out.println("--------------------------");
			
			System.out.print("상품번호 입력>");
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
			
//DB연결			
		try {
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB 연결 성공!");
			}
			
			//DB연결 완료
			
					
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
