import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.print(n+"! = ");
		System.out.println("1 = " + factorial(n));
		
	}
	static int factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}else {
			System.out.print(n + " * ");
			return n * factorial(n-1);
		}
	}
	
}
