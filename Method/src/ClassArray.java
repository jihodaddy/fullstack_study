//import java.util.*;
//
//class Subject{
//	String name;
//	int score;
//
////	Subject(int kor, int eng, int math){
////		this.kor = kor;
//		
////	}
//}
//
//class Student{
//	//속성
//	String name;
//	Subject[] subjectArray;
//	//생성자/리턴타입없음/클래스이름과 동일
//	//메서드 오버로딩(생성자 오버로딩)
//	Student(String name){
//		this.name = name;
//		this.subjectArray = new Subject[3];
//	}
//}
//
//public class ClassArray {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Student [] studentArray = new Student[3];
//		
////		for(int i = 0; i < studentArray.length; i++) {
////			studentArray[i]	= new Student();
////		}
//		studentArray[0] = new Student("장동건");
//		studentArray[1] = new Student("원빈");
//		studentArray[2] = new Student("이정재");
//		
//		System.out.println(Arrays.toString(studentArray));
//		
//		for(Student stu: studentArray) {
//			System.out.printf("학생: %s\n", stu.name);
//		}
//		System.out.println();
//		
//		Student jang = null;
//		for(Student stu: studentArray) {
//			if(stu.name.equals("장동건")) {
//				jang = stu;
//				break;
//			}
//		}
//		
//		for(int i = 0; i < jang.subjectArray.length; i++) {
//			jang.subjectArray[i] = new Subject();
//		}
//		System.out.printf("학생: %s\n과목별점수: %s\n", jang.name, Arrays.toString(jang.subjectArray));
//		
//		jang.subjectArray[0].name = "국어";
//		jang.subjectArray[0].score = 50;
//		jang.subjectArray[1].name = "영어";
//		jang.subjectArray[1].score = 60;
//		jang.subjectArray[2].name = "수학";
//		jang.subjectArray[2].score = 90;
//		
//		for(Subject sub: jang.subjectArray) {
//			System.out.printf("과목:%s, 점수:%d\n", sub.name, sub.score);
//		}
//		
//		
//				
//
//	
//	}
//}