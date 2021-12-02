package algorismProject1;

import java.util.Scanner;

// ������ ���� : ���� ������ ����
//�Է�
/*�л� �� �Է�: 5
�л�1 ���� �Է�: 90
�л�2 ���� �Է�: 77
�л�3 ���� �Է�: 82
�л�4 ���� �Է�: 65
�л�5 ���� �Է�: 94
*/

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� �Է�: ");
		int num = sc.nextInt();
		int[] arr = new int [num];
		
		for(int i=1; i<= arr.length; i++) {
			System.out.print("�л�"+ i + " ���� �Է�: ");
			arr[i-1] = sc.nextInt();
		}
		quickSort(arr,0,arr.length-1);
		
		System.out.println("\n���� ������ ����");
		for(int i=1; i<=arr.length; i++) {
			System.out.println(i + "�� :" + arr[i-1]);
		}
		sc.close();
	}
	static void quickSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int pivot = low; //���� ����
		int i = low +1; //���� ��ġ
		int j = high; // ������ ��ġ
		int temp;
		
		while(i <= j) { // ������ ������ �ݺ�, j�� i���� �۾����� while�� ����
			
			// �ǹ����� ���� ���� ���� ������ �ݺ�
			while(i<= high && arr[i] > arr[pivot]) {
				i++;
			}
			
			// �ǹ����� ū ���� ���� ������ �ݺ�
			while(j>low && arr[j] <= arr[pivot]) {
				j--;
			}
			
			if ( i > j) { // ������ ���°� �Ǹ�: �Ǻ��� j�� ��ȯ
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			}else { // i�� j ��ȯ
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		quickSort(arr, low, j-1);
		quickSort(arr, j+1, high);
		
	}


}
