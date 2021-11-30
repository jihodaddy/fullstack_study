package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// �ߺ� ���� �������� �ʴ� �Ӽ��� �̿��ؼ�
// �ζ� ��ȣ ����
public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		int count = 0;
		for(int i=0; set.size()<6; i++) {
			count++;
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			System.out.println("count: " + count);
		}
		
		System.out.println(set);
		
		List<Integer> list = new LinkedList<Integer>(set);
		
		System.out.println("list : "+ list);
		Collections.sort(list); // ��������
		System.out.println(list);
		
		Collections.reverse(list); // ��������
		System.out.println(list);
	}

}
