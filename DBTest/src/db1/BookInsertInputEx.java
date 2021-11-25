package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// �ֿܼ��� ������ �Է� �޾Ƽ�
// ���� ���̺� ����

public class BookInsertInputEx {

	public static void main(String[] args) {

	// �Է�
			Scanner sc = new Scanner(System.in);
			//������ �Է�
			System.out.println("���� ���� �Է�");
			System.out.println("----------------------------");
			System.out.print("������ȣ >");
			String bookNo = sc.nextLine();
			
			System.out.print("������ >");
			String bookName = sc.nextLine();
			
			System.out.print("���� >");
			String bookAuthor = sc.nextLine();
			
			System.out.print("���� ����>");
			int bookPrice = sc.nextInt();
			sc.nextLine();
			
			System.out.print("������ >");
			String bookDate = sc.nextLine();
			
			System.out.print("��� >");
			int bookStock = sc.nextInt();
			sc.nextLine();
			System.out.print("���ǻ� ��ȣ >");
			String pubNo = sc.nextLine();
			
			// ���� ���� ���� ���� ������ ���� �ʵ��� �о�帲
			//sc.nextLine();
	// DB����	
		try {
			// JDBC Driver Ŭ������ ��ü ���� ��Ÿ�ӽ� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver"); //������ ���� ����� �����
			
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
	// ������ ����					
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
