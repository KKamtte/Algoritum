/*
���� ����(bubble sort) �˰����� �̿��Ͽ� �л��� ���� ������������ �����ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�.

- hw3_1���� �ۼ��� Ŭ������ �����ϰ� �л� Ŭ������ ������ ��

- �Է�: �л���(n), n���� �л� ����
- ���: ���� ������������ ������ ��ü �л� ����

- ���� ��:
hw3_3: ȫ�浿
�л��� �Է�: 5
5���� �л� ������ �Է��ϼ���:
ȫ�浿 1411 3.5
��浿 1112 3.2
���浿 1113 4.3
ȫ�浿 1214 3.9
�ڱ浿 1105 3.2
���� �������� ���� ��� =
���浿 1113 4.3
ȫ�浿 1214 3.9
ȫ�浿 1411 3.5
��浿 1112 3.2
�ڱ浿 1105 3.2
*/
//���ϸ� : StudentTest
//�ۼ��� : �����
//�ۼ��� : 2020-04-10
//���� : bubble sort

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
		System.out.println("hw3_3 : �����\n");
		
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
		
		//�������� �˰��� ����
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
		
		//�л� ���� ���
		System.out.println("\n���� �������� ���� ��� = ");
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getNum() + " " + stu[i].getGrade());
		}
	}

}
