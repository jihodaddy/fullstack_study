package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5,2,8,3,1};
		bubbleSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	static void bubbleSort(int[] arr) {
		// ������ 2�� ��Ҹ� ��ȯ
		// 2���� ���� ��ȯ�� ��� ������ ���� �����ϴ� ���� ���� ���� ������
		// ���� ���� �����ϱ� ���� �ӽ� ��� �ʷ�
		
		int temp;
		// �� ����: �迭ũ�� - 1�� ����
		for(int i=1; i<arr.length; i++) {
		// �� ���庰 ��Ƚ��: �迭ũ��-���� Ƚ��
			for(int j=0; j<arr.length-i ;j++) {
				if(arr[j]> arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} //if
			} // for j
		} // for i
		

	}
	
}

//for(int i=0; i<arr.length; i++) {
//// �� ���庰 ��Ƚ��: �迭ũ��-���� Ƚ��
//	for(int j=0; j<arr.length-1-i ;j++) {
//		if(arr[j]> arr[j+1]) {
//			temp = arr[j];
//			arr[j] = arr[j+1];
//			arr[j+1] = temp;
//		} //if
//	} // for j
//} // for i
