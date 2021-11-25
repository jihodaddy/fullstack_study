package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookInsertEx {

	public static void main(String[] args) {
		
		try {
			//DB����
			// JDBC Driver Ŭ������ ��ü ���� ��Ÿ�ӽ� �ε�
//			Class.forName("com.mysql.cj.jdbc.Driver"); //������ ���� ����� �����
			
			// ���� �ּ�, ����� ����, �н����� ���ڿ� ����
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB �����ϱ� ���� ��ü ����
			// DriverManager�� ���� Connection ��ü ����
			// MySQL ���� ����: �ּ�, ����� ����, �н����� ����
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			// Connection ��ü�� �����Ǹ� DB���� ����
			if(con != null) {
				System.out.println("DB ���� ����!");
			}
			
			//DB���� �Ϸ�
			
			//������ ������
			String bookNo ="1016";
			String bookName = "�˰���";
			String bookAuthor = "��ö��";
			int bookPrice = 25000; 
			String bookDate = "2021-10-10";
			int bookStock = 10;
			String pubNo = "1";
			
			//sql �� �ۼ�
			String sql = "insert into book values(?,?,?,?,?,?,?)";
			
			// sql�� values �� ������ ����
			// prepare���� ��sql�� bookNo,bookName...Ÿ��,���� �� ����� ��
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,bookNo);
			pstmt.setString(2,bookName);
			pstmt.setString(3,bookAuthor);
			pstmt.setInt(4,bookPrice);
			pstmt.setString(5,bookDate);
			pstmt.setInt(6,bookStock);
			pstmt.setString(7,pubNo);
			
			// ������ ����: ������ ���� ���� �� ��ȯ
			// select: executeQuery() - ����� ResultSet ��ȯ
			// insert,update,delete : executeUpdate() - ������ ���� ���� �� ��ȯ
			int result = pstmt.executeUpdate();  // ���� ���� ��ȯ�ϱ� ������ int
			
			if(result > 0) {
				System.out.println("������ �Է� ����!");
			}
			pstmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		} 
		
	}

}
