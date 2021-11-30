package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		map.put("apple", "사과");
		map.put("summer", "여름");
		map.put("candy", "사탕");
		map.put("school", "학교");
		map.put("water", "물");
		
		System.out.println("총 Entry 수"+ map.size());
		System.out.println(map);
		
		while(true) {
			System.out.print("찾고 싶은 단어는?: ");
			String ans = sc.next();
			
			if(ans.equals("exit")) {
				break;
			}else {
				if(map.keySet().contains(ans)) {
					System.out.println(map.get(ans));
				}else{
						System.out.println(ans+"는 없는 단어 입니다.");
					}
					
				
			}
		}
		System.out.println("종료합니다...");
	
	}
}

