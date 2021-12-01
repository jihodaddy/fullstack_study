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
		// 인접한 2개 요소를 교환
		// 2개의 값을 교환할 경우 변수에 값을 저장하는 순간 이전 값은 없어짐
		// 이전 값을 보존하기 위해 임시 장소 필료
		
		int temp;
		// 총 라운드: 배열크기 - 1번 진행
		for(int i=1; i<arr.length; i++) {
		// 각 라운드별 비교횟수: 배열크기-라운드 횟수
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
//// 각 라운드별 비교횟수: 배열크기-라운드 횟수
//	for(int j=0; j<arr.length-1-i ;j++) {
//		if(arr[j]> arr[j+1]) {
//			temp = arr[j];
//			arr[j] = arr[j+1];
//			arr[j+1] = temp;
//		} //if
//	} // for j
//} // for i
