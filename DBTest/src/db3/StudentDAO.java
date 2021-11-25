package db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// (1) �����ڿ��� DB ����
// (2) selectStudent() �޼���: �����ͺ��̽��� student���� select�� ��� ���
// (3) insertStudent(StudentDTO dto) �޼���
//		- main()���� �Է��� student �����͸� ���� �޾Ƽ� 
// 		- student ���̺� insert �۾� ����
public class StudentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//(1)������: �����ͺ��̽� ����
	public StudentDAO() {
		try {
			// JDBC Driver Ŭ������ ��ü ���� ��Ÿ�ӽ� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver"); //������ ���� ����� �����
			
			// ���� �ּ�, ����� ����, �н����� ���ڿ� ����
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
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
//(2)insertStudent(StudentDTO dto) �޼���
		public void insertStudent(StudentDTO dto) {
			try {
				// sql�� �ۼ�
				String sql = "insert into Student values(?,?,?,?,?,?)";
				
				//sql�� values�� �� ������ ����
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,dto.getStdNo());
				pstmt.setString(2,dto.getStdName());
				pstmt.setInt(3,dto.getStdYear());
				pstmt.setString(4,dto.getStdAddress());
				pstmt.setString(5,dto.getStdBirthday());
				pstmt.setString(6,dto.getDptNo());
			
				//������ ����
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("������ �Է� ����!");
				}
				
			} catch (Exception e) {
					System.out.println("���� �߻�!");
				e.printStackTrace();
			}
			
			
		}
//(3)selectStudent() �޼���
	public void selectStudent() {
		
		try {
			// sql �ۼ�
			String sql = "select * from student order by stdNo";
			pstmt = con.prepareStatement(sql);
			
			
			rs = pstmt.executeQuery();
			
			System.out.println("�л� ����");
			System.out.println("--------------------------------------------------------------");
			System.out.println("�й�\t  �̸�\t\t�г�   �ּ�\t\t����\t  �а�");
			System.out.println("--------------------------------------------------------------");
			
			while(rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				String stdBirthday = rs.getString(5);
				String dptNo = rs.getString(6);
				
				System.out.format("%-10s%-13s%-4d%-16s%-13s%-10s\n",
						stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo
						
						);
			}
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
	
}
