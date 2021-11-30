package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		List <String>list = new ArrayList<String>();
		//4개의 단어를 입력받고 가장 긴 단어와 단어의 길이를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
//		list.add("flower");
//		list.add("sun");
//		list.add("student");
//		list.add("good");
		for(int i=0 ; i < 4; i++) {
			System.out.print("단어 입력: ");
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
		System.out.println("단어 리스트: " + list);
		System.out.println("가장 긴 단어: "+ maxStr);
		System.out.println("가장 긴 단어 길이: "+ max);
	}

}
