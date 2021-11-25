package db4;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProductDAO prdDAO = new ProductDAO();
		
		System.out.println("상품 정보 입력");
		System.out.println("--------------------------");
		
		System.out.print("상품번호 입력>");
		String prdNo = sc.nextLine();

		System.out.print("상품명 >");
		String prdName = sc.nextLine();
		
		System.out.print("상품가격 >");
		int prdPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제조사>");
		String prdMaker = sc.nextLine();
		System.out.print("색상 >");
		String prdColor = sc.nextLine();
		System.out.print("카테고리 >");
		String ctgNo = sc.nextLine();
		
		ProductDTO prdDTO = new ProductDTO(prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
		prdDAO.insertProduct(prdDTO);
		
		prdDAO.selectProduct();
		
	}

}
