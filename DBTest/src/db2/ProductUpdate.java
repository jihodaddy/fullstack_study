package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ������ ���� �Է�
		Scanner sc = new Scanner(System.in);
		
			System.out.println("��ǰ ���� ����");
			System.out.println("--------------------------");
			
			System.out.print("������ ��ǰ��ȣ �Է�>");
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
			String sql = "update product set prdName=?, prdPrice=?, prdMaker=?, prdColor=?, ctgNo=? where prdNo=?";
			
// sql ������ pstmt ��ü ����
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,prdName);
		pstmt.setInt(2,prdPrice);
		pstmt.setString(3,prdMaker);
		pstmt.setString(4,prdColor);
		pstmt.setString(5,ctgNo);
		pstmt.setString(6,prdNo);
			
// ������ ���� executeUpdate()
		int result = pstmt.executeUpdate(); 
		
		if(result > 0) {
			System.out.println("������ �Է� ����!");
		}
		pstmt.close();
		con.close();
		sc.close();	
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
	}

}
