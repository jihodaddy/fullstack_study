package db4;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProductDAO prdDAO = new ProductDAO();
		
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
		
		ProductDTO prdDTO = new ProductDTO(prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
		prdDAO.insertProduct(prdDTO);
		
		prdDAO.selectProduct();
		
	}

}
