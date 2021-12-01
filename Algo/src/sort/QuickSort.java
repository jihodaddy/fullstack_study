package sort;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 10,8,6,20,4,3,22,1,0,15,16};
		quickSort(arr,0,arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	static void quickSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int pivot = low;
		int i = low +1;
		int j = high;
		int temp;
		
		while(i <= j) { // 교차할 때까지 반복, j가 i보다 크면 while문 종료
			
			// 피벗보다 큰 값을 만날 때까지 반복
			while(i<= high && arr[i] < arr[pivot]) {
				i++;
			}
			
			// 피벗보다 작은 값을 만날 때까지 반복
			while(j>low && arr[j] >= arr[pivot]) {
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
