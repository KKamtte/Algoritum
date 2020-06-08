/*
버블 정렬(bubble sort) 알고리즘을 이용하여 학생을 성적 내림차순으로 정렬하는 자바 프로그램을 작성하시오.

- hw3_1에서 작성한 클래스와 동일하게 학생 클래스를 정의할 것

- 입력: 학생수(n), n명의 학생 정보
- 출력: 성적 내림차순으로 정렬한 전체 학생 정보

- 실행 예:
hw3_3: 홍길동
학생수 입력: 5
5명의 학생 정보를 입력하세요:
홍길동 1411 3.5
김길동 1112 3.2
남길동 1113 4.3
홍길동 1214 3.9
박길동 1105 3.2
성적 내림차순 정렬 결과 =
남길동 1113 4.3
홍길동 1214 3.9
홍길동 1411 3.5
김길동 1112 3.2
박길동 1105 3.2
*/
//파일명 : StudentTest
//작성자 : 김승현
//작성일 : 2020-04-10
//내용 : bubble sort

import java.util.Scanner;

class Student {
	private String s_name;
	private int s_num;
	private double s_grade;
	
	public Student(String name, int num, double grade) {
		this.s_name = name;
		this.s_num = num;
		this.s_grade = grade;
	}
	
	//성적 리턴
	public double getGrade() {
		return s_grade;
	}
	//학번리턴
	public int getNum() {
		return s_num;
	}
	//이름 리턴
	public String getName() {
		return s_name;
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw3_3 : 김승현\n");
		
		Scanner sc = new Scanner(System.in);
		//학생 수 입력받음
		System.out.print("학생 수 입력  : ");
		int n = sc.nextInt();
		
		//학생 객체 배열 생성
		Student[] stu = new Student[n];
		System.out.println("\n" + n + "명의 학생 정보를 입력하세요: ");
		
		//학생 정보 입력
		for(int i=0; i<stu.length; i++) {
			String name = sc.next();
			int num = sc.nextInt();
			double grade = sc.nextDouble();
			
			//학생 정보 객체에 저장
			stu[i] = new Student(name, num, grade);
		}
		
		/*
		double sum = 0;
		double max = 0;
		String best = "";
		
		//평균 성적 및 수석 학생 구하는 알고리즘 작성
		for(int i=0; i<stu.length; i++) {
			sum += stu[i].getGrade();
			
			if(stu[i].getGrade() > max) {
				max = stu[i].getGrade();
				best = stu[i].getName();
			}
		}
		
		System.out.println("\n성적 평균 = " + sum/n);
		System.out.println("\n수석 학생 성명 = " + best);
		*/
		
		//swap을 위한 임시 저장소
		String name;
		int num;
		double grade;
		
		//버블정렬 알고리즘 수행
		for(int i=0; i<stu.length; i++) {
			for(int j=0; j<stu.length -i -1; j++) {
				if(stu[j].getGrade() < stu[j+1].getGrade()) {
					name = stu[j].getName();
					num = stu[j].getNum();
					grade = stu[j].getGrade();
					
					stu[j] = new Student(stu[j+1].getName(), stu[j+1].getNum(), stu[j+1].getGrade());
					stu[j+1] = new Student(name, num, grade);
				}
			}
		}
		
		//학생 정보 출력
		System.out.println("\n성적 내름차순 정렬 결과 = ");
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getNum() + " " + stu[i].getGrade());
		}
	}

}
