package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//�ߺ��� ���� �� ���� �����
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("MyBatis");
		
		System.out.println("�� ��ü �� : "+ set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //��� �ִ� ��ü ����ŭ �ݺ�
			System.out.println(iterator.next());
		}
		
		set.remove("JDBC");
		set.remove("MyBatis");
		
		System.out.println();
		
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
		
	}

}
