package algorismProject1;

import java.util.Scanner;

// 퀵정렬 과제 : 성적 순으로 정렬
//입력
/*학생 수 입력: 5
학생1 점수 입력: 90
학생2 점수 입력: 77
학생3 점수 입력: 82
학생4 점수 입력: 65
학생5 점수 입력: 94
*/

public class QuickSort {

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
	static void quickSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int pivot = low; //가장 왼쪽
		int i = low +1; //왼쪽 위치
		int j = high; // 오른쪽 위치
		int temp;
		
		while(i <= j) { // 교차할 때까지 반복, j가 i보다 작아지면 while문 종료
			
			// 피벗보다 작은 값을 만날 때까지 반복
			while(i<= high && arr[i] > arr[pivot]) {
				i++;
			}
			
			// 피벗보다 큰 값을 만날 때까지 반복
			while(j>low && arr[j] <= arr[pivot]) {
				j--;
			}
			
			if ( i > j) { // 교차한 상태가 되면: 피봇과 j값 교환
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			}else { // i와 j 교환
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		quickSort(arr, low, j-1);
		quickSort(arr, j+1, high);
		
	}


}
