/*
** �� ���� Ŭ������ ���α׷��� �ۼ��ϼ���.

 

-----------------------------------
�л��� ��Ÿ���� Ŭ������ �����ϰ� �̿��ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�.

 

- �л��� ���� ������ ���ϸ�, �̸� �л� Ŭ������ �����Ѵ�.
  ����(���ڿ�)
  �й�(����)
  ����(�Ǽ�)

 

** Ŭ������ �̸��� �ڹ� ���ʿ� �°�(���� ��� Student) ���ϼ���.
** "�л� ����" ��� �ϸ� (����, �й�, ����) ������ ��θ� ���Ѵ�.
** ������ ��� �������� Ư���� ������ ���� ��,
   Ŭ���� ���� ��� �Ӽ��� private���� �ϰ�, �ʿ��� �޼ҵ���� �����Ͽ� �����ϵ��� �� ��
** ������ ��� �������� Ư���� �������� �ʴ� ��,
   ArrayList �� �ڹ��� ��� �ڷᱸ���� �� ����� �̿��ϸ� �ȵ�
   String, Scanner ���� �������� Ŭ������ �̿��� ��

 

 

- ����̹� Ŭ����(���� ��� StudentTest)

main���� ������ ����

(1) ����ڷκ��� �л���(n)�� �Է¹޴´�.

(2) ũ�Ⱑ n�� �л� �迭�� �����,
    n���� �л� ������ ����ڷκ��� �Է¹޾� �л� ��ü�� ����� �����Ѵ�.
    �� �� �� �л����� ����, �й�, ���� ������ �Է¹��� ��
(3) �ݺ����� �̿��Ͽ� n���� �л� ������ ��� ����Ѵ�.  **** �� �κ� �����մϴ�.

(4) n�� �л� ������ ��հ��� ���� ����Ѵ�.

(5) ������ �ְ����� �л��� ã�� ������ ����Ѵ�.
    �ְ����� �������̸�, ���� �տ� �ִ� �л� ������ ����� ��

 

- �Է�: �л���(n), n���� �л� ����
- ���: ��ü �л��� ���� ���, �ְ��� �л��� ����
*/

//���ϸ� : Hw3_1
//�ۼ��� : �����
//�ۼ��� : 2020-04-06


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
	//�̸� ����
	public String getName() {
		return s_name;
	}
	
}
public class Hw3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw3_1 : �����\n");
		
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
	}

}
