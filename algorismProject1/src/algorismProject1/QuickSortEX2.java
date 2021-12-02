package algorismProject1;

import java.util.Scanner;

// 퀵정렬, 피봇 가운데, do-while문
public class QuickSortEX2 {
	
	// 배열의 요소 a[idx1]와 a[idx2] 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//퀵 정렬
	static void quickSort(int[]a, int left, int right) {
		int pl = left; 			// 왼쪽 위치
		int pr = right;  		// 오른쪽 위치
		int x = a[(pl + pr)/2]; // 피봇
	
	do {
		 while (a[pl] > x) pl++; // x보다 a[pl]이 크면 통과하다가 작은수 만나면 정지
		while (a[pr] < x) pr--; // x보다 a[pr]이 작으면 통과하다가 큰수 만나면 정지
		if(pl <= pr)			// 정지 된상태에서 교환
			swap(a, pl++, pr--);
	}while(pl <= pr);
		
	if(left < pr) quickSort(a, left, pr); 	
	if(pl < right) quickSort(a, pl, right); 	
	
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
		quickSort(arr,0,arr.length-1);
		
		System.out.println("\n성적 순으로 정렬");
		for(int i=1; i<=arr.length; i++) {
			System.out.println(i + "등 :" + arr[i-1]);
		}
		
	sc.close();
	}
	
}
