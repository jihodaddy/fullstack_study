import java.util.*;

class Person{
	
	private int age; //private 나이속성추가
	//생성자 추가
	public Person(int initialAge) {
		this.age = initialAge;
		
	}
	public void amIOld(){
		if(this.age < 10) System.out.println("어리군요");
		else if(10 <= this.age&&this.age <=20) System.out.println("10대군요");
		else if(this.age >20) System.out.println("나이가 많으시네요");
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
