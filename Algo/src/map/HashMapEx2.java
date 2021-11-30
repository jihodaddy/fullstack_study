package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		map.put("apple", "���");
		map.put("summer", "����");
		map.put("candy", "����");
		map.put("school", "�б�");
		map.put("water", "��");
		
		System.out.println("�� Entry ��"+ map.size());
		System.out.println(map);
		
		while(true) {
			System.out.print("ã�� ���� �ܾ��?: ");
			String ans = sc.next();
			
			if(ans.equals("exit")) {
				break;
			}else {
				if(map.keySet().contains(ans)) {
					System.out.println(map.get(ans));
				}else{
						System.out.println(ans+"�� ���� �ܾ� �Դϴ�.");
					}
					
				
			}
		}
		System.out.println("�����մϴ�...");
	
	}
}

