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
			// 선택한 값(k에 해당)
			int temp = arr[i];
			
			// 현재 선택한 값의 이전 원소의 인덱스 저장
			int index = i-1;
			
			// 현재 값이 이전 원소보다 작으면 
			while(index >= 0 && temp < arr[index]) {
				// 이전 원소를 한 칸씩 뒤로 이동
				arr[index+1]= arr[index];
				index--;
			}
			
			//앞의 원소가 현재 값보다 작으면 반복문 종료
			//현재 값은 index번째 원소 뒤로 와야함
			//따라서 index+1위치에 현재값(k) 저장
			arr[index+1] = temp;
		}
	}
}
