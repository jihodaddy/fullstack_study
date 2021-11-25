package db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// (1) 생성자에서 DB 연결
// (2) selectStudent() 메서드: 데이터베이스의 student에서 select한 결과 출력
// (3) insertStudent(StudentDTO dto) 메서드
//		- main()에서 입력한 student 데이터를 전달 받아서 
// 		- student 테이블에 insert 작업 수행
public class StudentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//(1)생성자: 데이터베이스 연결
	public StudentDAO() {
		try {
			// JDBC Driver 클래스의 객체 생성 런타임시 로드
			Class.forName("com.mysql.cj.jdbc.Driver"); //지금은 이제 안적어도 실행됨
			
			// 연결 주소, 사용자 계쩡, 패스워드 문자열 생성
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
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
//(2)insertStudent(StudentDTO dto) 메서드
		public void insertStudent(StudentDTO dto) {
			try {
				// sql문 작성
				String sql = "insert into Student values(?,?,?,?,?,?)";
				
				//sql문 values에 들어갈 데이터 설정
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,dto.getStdNo());
				pstmt.setString(2,dto.getStdName());
				pstmt.setInt(3,dto.getStdYear());
				pstmt.setString(4,dto.getStdAddress());
				pstmt.setString(5,dto.getStdBirthday());
				pstmt.setString(6,dto.getDptNo());
			
				//쿼리문 실행
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("데이터 입력 성공!");
				}
				
			} catch (Exception e) {
					System.out.println("오류 발생!");
				e.printStackTrace();
			}
			
			
		}
//(3)selectStudent() 메서드
	public void selectStudent() {
		
		try {
			// sql 작성
			String sql = "select * from student order by stdNo";
			pstmt = con.prepareStatement(sql);
			
			
			rs = pstmt.executeQuery();
			
			System.out.println("학생 정보");
			System.out.println("--------------------------------------------------------------");
			System.out.println("학번\t  이름\t\t학년   주소\t\t생일\t  학과");
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
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
	
}
