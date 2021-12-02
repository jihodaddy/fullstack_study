package algorismProject1;

import java.util.Scanner;

// �����ε� quickSort(int[]a, int num)
public class QuickSortEX3 {
	
	// �迭 a[idx1]�� a[idx2] ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//�� ����
	static void quickSort(int[]a, int left, int right) {
		int l = left; 			// ���� ��ġ
		int r = right;  		// ������ ��ġ
		int pivot = a[(l + r)/2]; // �Ǻ�(���)
	
	do {
		while (a[l] > pivot) l++; //�迭 a�� �Ǻ� �������� ���� 
		while (a[r] < pivot) r--;
		if(l <= r)
			swap(a, l++, r--);
	}while(l <= r);
		
	if(left < r) quickSort(a, left, r);	// �������� ���� �׷� �ٽ� ������
	if(l < right) quickSort(a, l, right); //// �������� ������ �׷� �ٽ� ������
	
	
	}
	// �����ε�
	static void quickSort(int[]a, int n) {
		quickSort(a, 0, n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� �Է�: ");
		int num = sc.nextInt();
		int[] arr = new int [num];
		
		for(int i=1; i<= arr.length; i++) {
			System.out.print("�л�"+ i + " ���� �Է�: ");
			arr[i-1] = sc.nextInt();
		}
		quickSort(arr, num);
		
		System.out.println("\n���� ������ ����");
		for(int i=1; i<=arr.length; i++) {
			System.out.println(i + "�� :" + arr[i-1]);
		}
		
	sc.close();
	}
	
}
