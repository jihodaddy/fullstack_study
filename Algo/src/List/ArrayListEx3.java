package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		List <String>list = new ArrayList<String>();
		//4���� �ܾ �Է¹ް� ���� �� �ܾ�� �ܾ��� ���̸� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
//		list.add("flower");
//		list.add("sun");
//		list.add("student");
//		list.add("good");
		for(int i=0 ; i < 4; i++) {
			System.out.print("�ܾ� �Է�: ");
			list.add(sc.nextLine()); //next()
		}
		
		 int max = list.get(0).length();
		 String maxStr = list.get(0);
		
		for(int i=1; i<list.size(); i++) {
			if(max < list.get(i).length()) {
				max = list.get(i).length();
				maxStr = list.get(i);
			}
		}
		System.out.println("�ܾ� ����Ʈ: " + list);
		System.out.println("���� �� �ܾ�: "+ maxStr);
		System.out.println("���� �� �ܾ� ����: "+ max);
	}

}
