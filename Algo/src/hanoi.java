import java.util.Scanner;

public class hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
			System.out.print("원반 개수 입력: ");
			int n = sc.nextInt();
			
			hanoi(1, 2, 3, n);
			
			}

	

	static void hanoi(int from, int m, int to, int n) {
		
		System.out.printf("f:%d m:%d t:%d n:%d\n", from, m, to, n);
		
		if(n == 0)
			return;
		
		hanoi(from, to, m, n-1); // 원판 n-1을 from -> m으로 이동
		System.out.printf("원반 [%d]을 %d에서 %d로 이동\n", n, from, to); //원반 n이 from -> to로 이동
		hanoi(m, from, to, n-1); // 원반 n-1을 m -> to로 이동
	}
}
