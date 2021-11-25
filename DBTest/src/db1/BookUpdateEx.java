package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookUpdateEx {

	public static void main(String[] args) {

	// �Է�
			Scanner sc = new Scanner(System.in);
			//������ �Է�
			System.out.println("���� ���� ����");
			System.out.println("----------------------------");
			System.out.print("������ ������ȣ �Է� >");
			String bookNo = sc.nextLine();
			
			System.out.print("������ �Է� >");
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
			
			// ���� ���� ���� ���� ������ ���� �ʵ��� �о�帲 nextInt ������
			// sc.nextLine();
			//������ ������ �Է� �Ϸ�
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
				// DB ���� �Ϸ�
				
				// sql�� �ۼ�
				// ������ ����: UPDATE��: update ���̺�� set ���̸�=�� where ����;
				// �Էµ� ������ ���� ��ȣ�� ã�Ƽ� �Էµ� ������ ����
				// ����! �⺻Ű ���� �Ұ��ϹǷ� bookNo�� set�� ����
				String sql = "update book set bookName=?, bookAuthor=?,"
							+ "bookPrice=?, bookDate=?, bookStock=?, pubNo=? where bookNo=?";

				//������ ������ ���� PreparedStatement ��ü ����
				// Connection �������̽��� prepareStatement()�޼��带 ����Ͽ� ��ü ����
				// sql ������ ������ ���� ������ ����
				// ��ȣ�� ? �������
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1,bookName);
				pstmt.setString(2,bookAuthor);
				pstmt.setInt(3,bookPrice);
				pstmt.setString(4,bookDate);
				pstmt.setInt(5,bookStock);
				pstmt.setString(6,pubNo);
				pstmt.setString(7,bookNo);
				
				// ���� ������: ������ ���� ���� �� ��ȯ
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("������ ���� ����!");
				}
				pstmt.close();
				con.close();
				sc.close();
				
				
				//��� ��� : ����!
			} catch (Exception e) {
				System.out.println("���� �߻�!");
				e.printStackTrace();
			}
			
	}

}
