//Ex06 e = new Ex06();
//
//            // ���� 1) x���� y������ ���� ����ϴ� �޼���
//            int x = 1;
//            int y = 10;
//            e.test1(x, y);
//
//            // ���� 2) arr�迭�� ���޹޾� �ִ밪�� ����ϴ� �޼���
//            int[] arr = {87, 100, 35, 12, 46};
//            e.test2(arr);
//
//            // ���� 3) arr�迭�� idx1 , idx2�� ���޹޾� idx1��°�� idx2��°�� ��ü�ѵ� ����ϴ� �޼���
//            int idx1 = 1;
//            int idx2 = 4;
//            e.test3(arr, idx1, idx2);
import java.util.Arrays;
class Ex02{
	void test1(int x, int y) {
		int total = 0;
		for(int i = x; i <= y; i++) {
			total += i;
		}
		System.out.println(total);
	}
	void test2(int [] arr) {
		int max = 0;
		for(int val:arr) {
			if(max < val) max=val;
			}
		System.out.println(max);
	}
	void test3(int[]arr,int idx1,int idx2) {
		int imsi = 0;
		 imsi = arr [idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = imsi;
		
		System.out.println(Arrays.toString(arr));
	}
	
}
public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex02 e = new Ex02();
		int x = 1;
		int y = 10;
		e.test1(x,y);
		
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);
	}

}
