package dbProject;

import java.util.Scanner;


public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DAO ��ü �����ϸ鼭 DB ����
		// ��ü �����ɶ� ������ ȣ��Ǹ鼭 DB ����� 
		BookDAO bookDAO = new BookDAO();
		
		System.out.println("���� ���� ���");
		System.out.println("----------------------------");
		
		System.out.print("���� ��ȣ �Է� >");
		String bookNo = sc.nextLine();
		
		System.out.print("���� ���� �Է� >");
		String bookTitle = sc.nextLine();
		
		System.out.print("���� �Է� >");
		String bookAuthor = sc.nextLine();
		
		System.out.print("���࿬�� �Է� >");
		int bookYear = sc.nextInt();
		sc.nextLine();

		System.out.print("���� �Է� >");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���ǻ� �Է� >");
		String bookPublisher = sc.nextLine();
		
		BookDTO bookDTO = new BookDTO(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
		bookDAO.insertBook(bookDTO);
		
		
		
		bookDAO.selectBook();
		
		
		
	}

}
