/*
** 두 개의 클래스로 프로그램을 작성하세요.

 

-----------------------------------
학생을 나타내는 클래스를 정의하고 이용하는 자바 프로그램을 작성하시오.

 

- 학생은 다음 정보를 지니며, 이를 학생 클래스로 정의한다.
  성명(문자열)
  학번(정수)
  성적(실수)

 

** 클래스의 이름은 자바 관례에 맞게(예를 들어 Student) 정하세요.
** "학생 정보" 라고 하면 (성명, 학번, 성적) 세가지 모두를 말한다.
** 앞으로 모든 과제에서 특별한 이유가 없는 한,
   클래스 내의 모든 속성은 private으로 하고, 필요한 메소드들을 정의하여 접근하도록 할 것
** 앞으로 모든 과제에서 특별히 지시하지 않는 한,
   ArrayList 등 자바의 고급 자료구조와 그 기능을 이용하면 안됨
   String, Scanner 등의 기초적인 클래스는 이용할 것

 

 

- 드라이버 클래스(예를 들어 StudentTest)

main에서 다음을 수행

(1) 사용자로부터 학생수(n)를 입력받는다.

(2) 크기가 n인 학생 배열을 만들고,
    n명의 학생 정보를 사용자로부터 입력받아 학생 객체를 만들어 저장한다.
    이 때 각 학생별로 성명, 학번, 성적 순으로 입력받을 것
(3) 반복문을 이용하여 n명의 학생 정보를 모두 출력한다.  **** 이 부분 삭제합니다.

(4) n명 학생 성적의 평균값을 구해 출력한다.

(5) 성적이 최고점인 학생을 찾아 성명을 출력한다.
    최고점이 여러명이면, 가장 앞에 있는 학생 성명을 출력할 것

 

- 입력: 학생수(n), n명의 학생 정보
- 출력: 전체 학생의 성적 평균, 최고점 학생의 성명
*/

//파일명 : Hw3_1
//작성자 : 김승현
//작성일 : 2020-04-06


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
	//이름 리턴
	public String getName() {
		return s_name;
	}
	
}
public class Hw3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw3_1 : 김승현\n");
		
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
	}

}
