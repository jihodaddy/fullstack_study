package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductInputInsert {

	public static void main(String[] args) {

//����� ���� �Է�
		Scanner sc = new Scanner(System.in);
		
			System.out.println("��ǰ ���� �Է�");
			System.out.println("--------------------------");
			
			System.out.print("��ǰ��ȣ �Է�>");
			String prdNo = sc.nextLine();

			System.out.print("��ǰ�� >");
			String prdName = sc.nextLine();
			
			System.out.print("��ǰ���� >");
			int prdPrice = sc.nextInt();
			sc.nextLine();
			
			System.out.print("������>");
			String prdMaker = sc.nextLine();
			System.out.print("���� >");
			String prdColor = sc.nextLine();
			System.out.print("ī�װ� >");
			String ctgNo = sc.nextLine();
			
//DB����			
		try {
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB ���� ����!");
			}
			
			//DB���� �Ϸ�
			
					
//sql �� �ۼ�
			String sql = "insert into product values(?,?,?,?,?,?)";
			
// sql ������ pstmt ��ü ����
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,prdNo);
			pstmt.setString(2,prdName);
			pstmt.setInt(3,prdPrice);
			pstmt.setString(4,prdMaker);
			pstmt.setString(5,prdColor);
			pstmt.setString(6,ctgNo);
			
// ������ ���� executeUpdate()
			int result = pstmt.executeUpdate(); 
			
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
