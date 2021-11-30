package List;

import java.util.ArrayList;

public class ArrayListEmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>(5);
		
		Employee e1 = new Employee(100, "김사원", 3000.55);
		Employee e2 = new Employee(100, "박대리", 4000.55);
		Employee e3 = new Employee(100, "최과장", 5000.55);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			Employee emp = list.get(i);
			System.out.println(emp);
		}
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
