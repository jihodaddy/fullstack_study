package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductSelect {

	public static void main(String[] args) {
		// db연동
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
				String user = "root";
				String pwd = "1234";
				
				Connection con = DriverManager.getConnection(url, user, pwd);
				
				if(con != null) {
					System.out.println("DB 연동 성공");
				}
				String sql = "select * from Product order by prdNo";
				
				//sql 전달할 pstmt 객체 생성
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				ResultSet rs = pstmt.executeQuery(sql);
				
				System.out.println("상품 정보");
				System.out.println("--------------------------------------------------------"
						+ "--------------------------------------------");
				System.out.println("상품번호\t 상품명\t\t\t\t 상품가격\t\t 제조사\t\t\t색상\t    카테고리");
				System.out.println("--------------------------------------------------------"
						+ "--------------------------------------------");
				
				while(rs.next()) {
				
					String prdNo = rs.getString(1); 
					String prdName =rs.getString(2); 
					int prdPrice = rs.getInt(3); 
					String prdMaker = rs.getString(4); 
					String prdColor = rs.getString(5); 
					String ctgNo = rs.getString(6);
				
					System.out.format("%-5s\t %-25s\t %-15d %-15s\t%-10s\t%-10s\n",
							prdNo, prdName,prdPrice, prdMaker, prdColor, ctgNo
							);
					
				}
			
				
			} catch (Exception e) {
				System.out.println("오류 발생");
				e.printStackTrace();
			}
		
				
	}

}
