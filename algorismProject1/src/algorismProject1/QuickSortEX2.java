package algorismProject1;

import java.util.Scanner;

// ������, �Ǻ� ���, do-while��
public class QuickSortEX2 {
	
	// �迭�� ��� a[idx1]�� a[idx2] ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//�� ����
	static void quickSort(int[]a, int left, int right) {
		int pl = left; 			// ���� ��ġ
		int pr = right;  		// ������ ��ġ
		int x = a[(pl + pr)/2]; // �Ǻ�
	
	do {
		 while (a[pl] > x) pl++; // x���� a[pl]�� ũ�� ����ϴٰ� ������ ������ ����
		while (a[pr] < x) pr--; // x���� a[pr]�� ������ ����ϴٰ� ū�� ������ ����
		if(pl <= pr)			// ���� �Ȼ��¿��� ��ȯ
			swap(a, pl++, pr--);
	}while(pl <= pr);
		
	if(left < pr) quickSort(a, left, pr); 	
	if(pl < right) quickSort(a, pl, right); 	
	
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
		quickSort(arr,0,arr.length-1);
		
		System.out.println("\n���� ������ ����");
		for(int i=1; i<=arr.length; i++) {
			System.out.println(i + "�� :" + arr[i-1]);
		}
		
	sc.close();
	}
	
}
