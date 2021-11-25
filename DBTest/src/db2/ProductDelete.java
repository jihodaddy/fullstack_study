package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDelete {

	public static void main(String[] args) {

// ������ ��ǰ ��ȣ �Է�
		Scanner sc = new Scanner(System.in);
		//������ �Է�
		System.out.println("��ǰ ���� ����");
		System.out.println("----------------------------");
		
		System.out.print("������ ��ǰ��ȣ �Է� >");
		String prdNo = sc.nextLine();
		
// DB����
		try {
			//DB����
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB ���� ����!");
			}
			
			//DB���� �Ϸ�
			
					
//sql �� �ۼ�
		String sql = "delete from product where prdNo=?";
			
// sql ������ pstmt ��ü ����
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,prdNo);
			
// ���� ������
		int result = pstmt.executeUpdate();
		// ��� ���
		if(result >0) {
			System.out.println("���� ����!");
		}else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		sc.close();
		pstmt.close();
		con.close();

			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}		
	}

}
