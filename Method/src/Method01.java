import java.util.*;
/*
            Ex01 e = new Ex01();

            // 문제 1) 1부터 5까지의 합을 출력하는 메서드
            e.test1();

            // 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
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
