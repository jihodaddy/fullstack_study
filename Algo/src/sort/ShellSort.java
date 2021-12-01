package sort;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = { 10,8,6,20,4,3,22,1,0,15,16};
		shellSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	static void shellSort(int[] arr) {
		int N = arr.length;
		
		for(int h=N/2; h>0 ;h/=2) {
//			System.out.println(h); // 간격 h확인
			for(int i=h; i<N; i++) { 
				// 삽입 정렬을 하기 위해 서브 리스트에 두번째 값을 가지고 값을 비교
				int index = i-h;
				
				int temp = arr[i];
				
				//삽입 정렬 수행
				while(index >= 0 && arr[index] >temp) {
					arr[index+h] = arr[index];
					index -= h;
				}
				arr[index + h] = temp;
			}
			//각 간격마다 정렬 결과 (5간격/ 2간격/ 1간격)
//			for(int a : arr) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
		}
	}
}
