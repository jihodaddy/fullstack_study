package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public BookDAO() {
		try {
			
			// 연결 주소, 사용자 계쩡, 패스워드 문자열 생성
			String url = "jdbc:mysql://localhost:3306/dbtest?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB 연결하기 위한 객체 생성
			// DriverManager를 통해 Connection 객체 생성
			// MySQL 서버 연결: 주소, 사용자 계정, 패스워드 전송
			con = DriverManager.getConnection(url, user, pwd);
			
			// Connection 객체가 생성되면 DB연결 성공
			if(con != null) {
				System.out.println("DB 연결 성공!");
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}
		public void insertBook(BookDTO bookDTO) {
			
			try {
				//sql 문 작성
				String sql = "insert into book values(?,?,?,?,?,?)";
				
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,bookDTO.getBookNo());
				pstmt.setString(2,bookDTO.getBookTitle());
				pstmt.setString(3,bookDTO.getBookAuthor());
				pstmt.setInt(4,bookDTO.getBookYear());
				pstmt.setInt(5,bookDTO.getBookPrice());
				pstmt.setString(6,bookDTO.getBookPublisher());
				
				// 쿼리문 실행
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("데이터 입력 성공!");
				}
			} catch (Exception e) {
					System.out.println("오류 발생!");
				e.printStackTrace();
			}
		}
		
		public void selectBook() {

			try {
				// sql 작성
				String sql = "select * from book order by bookNo";
				pstmt = con.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				
				System.out.println("도서 정보");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("도서번호\t   도서제목\t\t 저자\t발행연도\t 가격\t\t  출판사");
				System.out.println("-----------------------------------------------------------------------");
				
				while(rs.next()) {
					String bookNo = rs.getString(1);
					String bookTitle= rs.getString(2);
					String bookAuthor= rs.getString(3);
					int bookYear= rs.getInt(4);
					int bookPrice= rs.getInt(5);
					String bookPublisher= rs.getString(6);
					
					System.out.format("%-10s %-15s\t %-5s\t %-5d\t %-10d\t %-10s\n",
						bookNo,  bookTitle,  bookAuthor,  bookYear,  bookPrice, bookPublisher);
				}
				
			} catch (Exception e) {
				System.out.println("오류 발생");
				e.printStackTrace();
			}
			
				
		}
		
	}
	
	
	

