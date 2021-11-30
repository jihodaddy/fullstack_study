package map;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("ģ��1", 
				new String[] {"010-1111-1111","02-1111-1111", "fri@multi.com"});
		phone.put("ģ��2", 
				new String[] {"010-2222-2221","02-2222-1222", "fri2@multi.com"});
		phone.put("�����", 
				new String[] {"010-3331-3331","02-3333-1333", "fri3@multi.com"});
		phone.put("ȸ�絿��", 
				new String[] {"010-4444-4444","02-4444-1444", "donggo@mul.com"});
		phone.put("��â", 
				new String[] {"010-5551-5551","02-5555-1555", "school@multi.com"});
		
		System.out.println("�� �׷��: "+ phone.size());
		
		// �� ����ó ��� ���� ��ȸ
		for(String k : phone.keySet()) {
			System.out.println(k+ ":");
//			String[] phoneList = phone.get(k);
//			for(String one : phoneList) {
				for(String one : phone.get(k)) {
				System.out.print(one + " | ");
			}
		System.out.println();
		}
		System.out.println("\nȸ�� ���� �˻�: ");
		if(phone.containsKey("ȸ�絿��")) {
			for(String one : phone.get("ȸ�絿��")) {
				System.out.print(one + " | ");
			}

		}
		System.out.println("\n����� �˻�: ");
		if(phone.containsKey("�����")) {
			for(String one : phone.get("�����")) {
				System.out.print(one + " | ");
			}

		}else {
			System.out.println("����ó ����");
		}

		
		
	}
}