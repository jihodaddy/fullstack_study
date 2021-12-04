import java.util.Arrays;
import java.util.Random;

class Ex04{

    int test1(int[] arr) {
    	int cnt = 0;
    	for(int i = 0; i < arr.length; i++) {
    		// for(int i : arr) { 이렇게 표현도 가능
    		if(arr[i]%4==0) { cnt++;}
    	}
    	return cnt; }
    //참조형을 리텅. 값이 들어있는 메모리의 위치를 돌려줌.
    
    int[] test2(int cnt, int[] arr) {
    	
    	int [] newArr = new int [cnt];
    	int idx = 0;
    	for(int val : arr) {
    		if(val%4 ==0) {
    			newArr[idx]= val;
    			idx++;
	   		}
    	}
    		
    	
    	
    	return newArr; }

    	
    }
    
public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Ex04 e = new Ex04();

        int[] arr = {87, 12, 21, 56, 100};
		
        // 문제 1) 4의 배수의 개수를 리턴해주는 메서드
        int cnt = e.test1(arr);
        System.out.println("cnt = " + cnt);
        
        // 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
        int[] arra = e.test2(3, arr);
        System.out.println(Arrays.toString(arra));
	}

}
