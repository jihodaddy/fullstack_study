package algorismProject1;

import java.util.Scanner;

// 오버로드 quickSort(int[]a, int num)
public class QuickSortEX3 {
	
	// 배열 a[idx1]와 a[idx2] 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//퀵 정렬
	static void quickSort(int[]a, int left, int right) {
		int l = left; 			// 왼쪽 위치
		int r = right;  		// 오른쪽 위치
		int pivot = a[(l + r)/2]; // 피봇(가운데)
	
	do {
		while (a[l] > pivot) l++; //배열 a를 피봇 기준으로 나눔 
		while (a[r] < pivot) r--;
		if(l <= r)
			swap(a, l++, r--);
	}while(l <= r);
		
	if(left < r) quickSort(a, left, r);	// 나뉘어진 왼쪽 그룹 다시 퀵정렬
	if(l < right) quickSort(a, l, right); //// 나뉘어진 오른쪽 그룹 다시 퀵정렬
	
	
	}
	// 오버로드
	static void quickSort(int[]a, int n) {
		quickSort(a, 0, n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력: ");
		int num = sc.nextInt();
		int[] arr = new int [num];
		
		for(int i=1; i<= arr.length; i++) {
			System.out.print("학생"+ i + " 점수 입력: ");
			arr[i-1] = sc.nextInt();
		}
		quickSort(arr, num);
		
		System.out.println("\n성적 순으로 정렬");
		for(int i=1; i<=arr.length; i++) {
			System.out.println(i + "등 :" + arr[i-1]);
		}
		
	sc.close();
	}
	
}
