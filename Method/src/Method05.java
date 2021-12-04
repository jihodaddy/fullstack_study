import java.util.*;

class Ex05{
	final int test1(int[]arr){
		int total = 0;
		for(int val : arr) {
			total += val;
		}
		return total ;
	}
	
	int test2(int[]arr) {
		int sum= 0;
		for(int val : arr) {
			if(val%4==0) sum +=val; 
		}
		return sum ;
	}
	
	int test3(int[]arr) {
		int cnt = 0;
		for(int val : arr) {
			if(val%4==0) cnt++;
		}
		
		return cnt;
	}
	int test4(int[]arr) {
		int cnt = 0;
		for(int val : arr) {
			if(val%2==0) cnt++;
		}
		return cnt ;
	}
}

	
public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex05 e = new Ex05();

        int[] arr = {87, 100, 11, 72, 92};
		
        int total = e.test1(arr);
        System.out.println("total = " + total);
	
        int sum = e.test2(arr);
        System.out.println("sum = " + sum);

        int cnt = e.test3(arr);
        System.out.println("cnt = " + cnt);
        
        int cntmod = e.test4(arr);
        System.out.println("cnt = " + cnt);
	}

}
