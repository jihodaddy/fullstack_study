package dbProject;

import java.util.Scanner;


public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DAO 객체 생성하면서 DB 연결
		// 객체 생성될때 생성자 호출되면서 DB 연결됨 
		BookDAO bookDAO = new BookDAO();
		
		System.out.println("도서 정보 등록");
		System.out.println("----------------------------");
		
		System.out.print("도서 번호 입력 >");
		String bookNo = sc.nextLine();
		
		System.out.print("도서 제목 입력 >");
		String bookTitle = sc.nextLine();
		
		System.out.print("저자 입력 >");
		String bookAuthor = sc.nextLine();
		
		System.out.print("발행연도 입력 >");
		int bookYear = sc.nextInt();
		sc.nextLine();

		System.out.print("가격 입력 >");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 입력 >");
		String bookPublisher = sc.nextLine();
		
		BookDTO bookDTO = new BookDTO(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
		bookDAO.insertBook(bookDTO);
		
		
		
		bookDAO.selectBook();
		
		
		
	}

}
