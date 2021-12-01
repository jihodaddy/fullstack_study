package sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 5,2,8,3,1};
		insertionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			// ������ ��(k�� �ش�)
			int temp = arr[i];
			
			// ���� ������ ���� ���� ������ �ε��� ����
			int index = i-1;
			
			// ���� ���� ���� ���Һ��� ������ 
			while(index >= 0 && temp < arr[index]) {
				// ���� ���Ҹ� �� ĭ�� �ڷ� �̵�
				arr[index+1]= arr[index];
				index--;
			}
			
			//���� ���Ұ� ���� ������ ������ �ݺ��� ����
			//���� ���� index��° ���� �ڷ� �;���
			//���� index+1��ġ�� ���簪(k) ����
			arr[index+1] = temp;
		}
	}
}
