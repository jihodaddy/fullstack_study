import java.util.Arrays;
import java.util.Random;

class Ex04{

    int test1(int[] arr) {
    	int cnt = 0;
    	for(int i = 0; i < arr.length; i++) {
    		// for(int i : arr) { �̷��� ǥ���� ����
    		if(arr[i]%4==0) { cnt++;}
    	}
    	return cnt; }
    //�������� ����. ���� ����ִ� �޸��� ��ġ�� ������.
    
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
		
        // ���� 1) 4�� ����� ������ �������ִ� �޼���
        int cnt = e.test1(arr);
        System.out.println("cnt = " + cnt);
        
        // ���� 2) 4�� ����� ������ŭ�� ���ο� �迭�� �����, 4�� ����� ������ �迭�� �������ִ� �޼���
        int[] arra = e.test2(3, arr);
        System.out.println(Arrays.toString(arra));
	}

}
