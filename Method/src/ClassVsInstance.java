import java.util.*;

class Person{
	
	private int age; //private ���̼Ӽ��߰�
	//������ �߰�
	public Person(int initialAge) {
		this.age = initialAge;
		
	}
	public void amIOld(){
		if(this.age < 10) System.out.println("�����");
		else if(10 <= this.age&&this.age <=20) System.out.println("10�뱺��");
		else if(this.age >20) System.out.println("���̰� �����ó׿�");
	}
	public void yearPasses() {
		this.age++;
	}
	
}
public class ClassVsInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0 ; i < T; i ++) {
			
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for(int j = 0; j < 3; j++){
				p.yearPasses();
			}
			p.amIOld();;
			System.out.println();
		}
		
	}

}
