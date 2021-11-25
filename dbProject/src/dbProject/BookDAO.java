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
			
			// ���� �ּ�, ����� ����, �н����� ���ڿ� ����
			String url = "jdbc:mysql://localhost:3306/dbtest?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB �����ϱ� ���� ��ü ����
			// DriverManager�� ���� Connection ��ü ����
			// MySQL ���� ����: �ּ�, ����� ����, �н����� ����
			con = DriverManager.getConnection(url, user, pwd);
			
			// Connection ��ü�� �����Ǹ� DB���� ����
			if(con != null) {
				System.out.println("DB ���� ����!");
			}
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
	}
		public void insertBook(BookDTO bookDTO) {
			
			try {
				//sql �� �ۼ�
				String sql = "insert into book values(?,?,?,?,?,?)";
				
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,bookDTO.getBookNo());
				pstmt.setString(2,bookDTO.getBookTitle());
				pstmt.setString(3,bookDTO.getBookAuthor());
				pstmt.setInt(4,bookDTO.getBookYear());
				pstmt.setInt(5,bookDTO.getBookPrice());
				pstmt.setString(6,bookDTO.getBookPublisher());
				
				// ������ ����
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("������ �Է� ����!");
				}
			} catch (Exception e) {
					System.out.println("���� �߻�!");
				e.printStackTrace();
			}
		}
		
		public void selectBook() {

			try {
				// sql �ۼ�
				String sql = "select * from book order by bookNo";
				pstmt = con.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				
				System.out.println("���� ����");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("������ȣ\t   ��������\t\t ����\t���࿬��\t ����\t\t  ���ǻ�");
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
				System.out.println("���� �߻�");
				e.printStackTrace();
			}
			
				
		}
		
	}
	
	
	

