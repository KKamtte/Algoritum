/*
선택 정렬(selection sort) 알고리즘을 이용하여 학생을 성명 오름차순으로 정렬하는 자바 프로그램을 작성하시오.

 

- hw3_1에서 작성한 클래스와 동일하게 학생 클래스를 정의할 것

 

- 입력: 학생수(n), n명의 학생 정보
- 출력: 성명 오름차순으로 정렬한 전체 학생 정보
*/

//파일명 : StudentTest
//작성자 : 김승현
//작성일 : 2020-04-10

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
		System.out.println("hw3_2 : 김승현\n");
		
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
		int x=0;
		
		//선택정렬 알고리즘 수행
		for(int i=0; i<stu.length-1; i++) {
			//최소값을 찾기위한 저장
			name = stu[i].getName();
			
			//오름차순 저장
			for(int j=i+1; j<stu.length; j++) {
				if(name.compareTo(stu[j].getName()) > 0) {
					name = stu[j].getName();
					x = j;
				}
			}
			
			//i번째 배열 오름차순값 대입
			name = stu[i].getName();
			num = stu[i].getNum();
			grade = stu[i].getGrade();
			
			stu[i] = new Student(stu[x].getName(), stu[x].getNum(), stu[x].getGrade());
			stu[x] = new Student(name, num, grade);
		}
		
		//학생 정보 출력
		System.out.println("\n성명 오름차순 정렬 결과 = ");
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getNum() + " " + stu[i].getGrade());
		}
	}

}
