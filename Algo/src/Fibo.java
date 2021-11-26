import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("항의 개수 입력: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i ++) {
			System.out.print(fibo(i)+ " ");
		}
		sc.close();
		
	}
	static int fibo(int n) {
		if(n ==1 || n ==2) return 1; 
		else return fibo(n-2) + fibo(n-1);
		}
			
		
	}

