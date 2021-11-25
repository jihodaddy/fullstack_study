package db4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	//생성자: db연결
	public ProductDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB 연동 성공");
					
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
		
	}
	//insertProduct 메소드
	public void insertProduct(ProductDTO dto) {
		
		try {
			//sql 문 작성
			String sql = "insert into product values(?,?,?,?,?,?)";
			
//sql 전달할 pstmt 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,dto.getPrdNo());
			pstmt.setString(2,dto.getPrdName());
		    pstmt.setInt(3,dto.getPrdPrice());
			pstmt.setString(4,dto.getPrdMaker());
			pstmt.setString(5,dto.getPrdColor());
			pstmt.setString(6,dto.getCtgNo());
			
//쿼리문 실행 executeUpdate()
			int result = pstmt.executeUpdate(); 
			
			if(result > 0) {
				System.out.println("데이터 입력 성공!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//selectProduct 메소드
	public void selectProduct() {
		
		try {
			String sql = "select * from Product order by prdNo";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
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
