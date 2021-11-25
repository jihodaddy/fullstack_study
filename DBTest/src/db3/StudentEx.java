package db3;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DAO ��ü �����ϸ鼭 DB ����
		// ��ü �����ɶ� ������ ȣ��Ǹ鼭 DB ����� 
		StudentDAO stdDAO = new StudentDAO();
		
		// (1)�л� ������ �Է�
		System.out.println("�л� ���� ���");
		System.out.println("----------------------------");
		
		System.out.print("�й� �Է� >");
		String stdkNo = sc.nextLine();
		
		System.out.print("���� �Է� >");
		String stdkName = sc.nextLine();
		
		System.out.print("�г� �Է� >");
		int stdkYear = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ּ� �Է� >");
		String stdkAddress = sc.nextLine();

		System.out.print("���� �Է� >");
		String stdkBirthday = sc.nextLine();
		
		System.out.print("�а���ȣ �Է� >");
		String dptNo = sc.nextLine();
		
		// StudentDTO ��ü ����
		// ������ ���ÿ� ������,  : ������ ȣ���ϸ鼭 �� ����
		StudentDTO stdDTO = new StudentDTO(stdkNo, stdkName, stdkYear, stdkAddress, stdkBirthday, dptNo);
		stdDAO.insertStudent(stdDTO);
		// StudentDAO Ŭ������ insertStudent() �޼��� ȣ���ϸ鼭 stdDTO ����
		
		
		
		
		// (2)�л� ���� ��ȸ : StudentDAO Ŭ������ selectStudent() �޼��� ȣ��
		// ��ü.�޼���
		stdDAO.selectStudent();
		
		
	
	
	
	}

}
