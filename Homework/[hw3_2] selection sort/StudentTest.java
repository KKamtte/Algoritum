/*
���� ����(selection sort) �˰����� �̿��Ͽ� �л��� ���� ������������ �����ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�.

 

- hw3_1���� �ۼ��� Ŭ������ �����ϰ� �л� Ŭ������ ������ ��

 

- �Է�: �л���(n), n���� �л� ����
- ���: ���� ������������ ������ ��ü �л� ����
*/

//���ϸ� : StudentTest
//�ۼ��� : �����
//�ۼ��� : 2020-04-10

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
	
	//���� ����
	public double getGrade() {
		return s_grade;
	}
	//�й�����
	public int getNum() {
		return s_num;
	}
	//�̸� ����
	public String getName() {
		return s_name;
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw3_2 : �����\n");
		
		Scanner sc = new Scanner(System.in);
		//�л� �� �Է¹���
		System.out.print("�л� �� �Է�  : ");
		int n = sc.nextInt();
		
		//�л� ��ü �迭 ����
		Student[] stu = new Student[n];
		System.out.println("\n" + n + "���� �л� ������ �Է��ϼ���: ");
		
		//�л� ���� �Է�
		for(int i=0; i<stu.length; i++) {
			String name = sc.next();
			int num = sc.nextInt();
			double grade = sc.nextDouble();
			
			//�л� ���� ��ü�� ����
			stu[i] = new Student(name, num, grade);
		}
		
		/*
		double sum = 0;
		double max = 0;
		String best = "";
		
		//��� ���� �� ���� �л� ���ϴ� �˰��� �ۼ�
		for(int i=0; i<stu.length; i++) {
			sum += stu[i].getGrade();
			
			if(stu[i].getGrade() > max) {
				max = stu[i].getGrade();
				best = stu[i].getName();
			}
		}
		
		System.out.println("\n���� ��� = " + sum/n);
		System.out.println("\n���� �л� ���� = " + best);
		*/
		
		//swap�� ���� �ӽ� �����
		String name;
		int num;
		double grade;
		int x=0;
		
		//�������� �˰��� ����
		for(int i=0; i<stu.length-1; i++) {
			//�ּҰ��� ã������ ����
			name = stu[i].getName();
			
			//�������� ����
			for(int j=i+1; j<stu.length; j++) {
				if(name.compareTo(stu[j].getName()) > 0) {
					name = stu[j].getName();
					x = j;
				}
			}
			
			//i��° �迭 ���������� ����
			name = stu[i].getName();
			num = stu[i].getNum();
			grade = stu[i].getGrade();
			
			stu[i] = new Student(stu[x].getName(), stu[x].getNum(), stu[x].getGrade());
			stu[x] = new Student(name, num, grade);
		}
		
		//�л� ���� ���
		System.out.println("\n���� �������� ���� ��� = ");
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getNum() + " " + stu[i].getGrade());
		}
	}

}
