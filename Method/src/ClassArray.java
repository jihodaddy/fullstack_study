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
//	//�Ӽ�
//	String name;
//	Subject[] subjectArray;
//	//������/����Ÿ�Ծ���/Ŭ�����̸��� ����
//	//�޼��� �����ε�(������ �����ε�)
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
//		studentArray[0] = new Student("�嵿��");
//		studentArray[1] = new Student("����");
//		studentArray[2] = new Student("������");
//		
//		System.out.println(Arrays.toString(studentArray));
//		
//		for(Student stu: studentArray) {
//			System.out.printf("�л�: %s\n", stu.name);
//		}
//		System.out.println();
//		
//		Student jang = null;
//		for(Student stu: studentArray) {
//			if(stu.name.equals("�嵿��")) {
//				jang = stu;
//				break;
//			}
//		}
//		
//		for(int i = 0; i < jang.subjectArray.length; i++) {
//			jang.subjectArray[i] = new Subject();
//		}
//		System.out.printf("�л�: %s\n��������: %s\n", jang.name, Arrays.toString(jang.subjectArray));
//		
//		jang.subjectArray[0].name = "����";
//		jang.subjectArray[0].score = 50;
//		jang.subjectArray[1].name = "����";
//		jang.subjectArray[1].score = 60;
//		jang.subjectArray[2].name = "����";
//		jang.subjectArray[2].score = 90;
//		
//		for(Subject sub: jang.subjectArray) {
//			System.out.printf("����:%s, ����:%d\n", sub.name, sub.score);
//		}
//		
//		
//				
//
//	
//	}
//}