import java.util.*;
/*
            Ex01 e = new Ex01();

            // ���� 1) 1���� 5������ ���� ����ϴ� �޼���
            e.test1();

            // ���� 2) ���� 3���� �迭�� �Է¹޾� �ִ밪�� ����ϴ� �޼���
            e.test2();
        */
class Ex01{
	void test() {
		int total = 0;
		for(int i =1 ;i <=5; i++ ) {
			total += i;
		}
		System.out.println(total);
	}
	void test02() {
		Random rand = new Random();
		int[] arr = new int [3];
		for(int i=0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));		
		
		int max=0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >max) {max = arr[i];}
		}
	}
}
	

	
public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 e = new Ex01();
		e.test();
		
		e.test02();
		
	}

}
