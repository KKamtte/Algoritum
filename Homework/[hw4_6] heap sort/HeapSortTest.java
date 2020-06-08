import java.util.Scanner;

//���ϸ� : HeapSortTest
//�ۼ��� : �����
//�ۼ��� : 2020-04-16
//���� : [hw4_6] Heap sort

public class HeapSortTest {
	public static void main(String[] args) {
		System.out.println("hw4_6 : �����");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n�� ���� �Է� :");
		int n1 = sc.nextInt(); //�� ����
		
		System.out.print("�ﰢ�� ���� �Է� :");
		int n2 = sc.nextInt(); //�ﰢ�� ����
		
		Figure[] figureArray = new Figure[n1+n2]; //ũ�Ⱑ n1+n2�� ���� �迭 ����
		
		System.out.println("\n"+n1 + "���� �� ����(������)�� �Է��ϼ���:");
		
		for(int i=0; i<n1; i++) {
			double rad = sc.nextDouble(); //������ ���� �Է¹���
			figureArray[i] = new Circle(rad); //��ü���� �迭�� ����
		}
		
		System.out.println("\n"+n2 + "���� �ﰢ�� ����(�غ��� ����)�� �Է��ϼ���:");
		for(int i=n1; i<n1+n2; i++) {
			figureArray[i] = new Triangle(sc.nextDouble(), sc.nextDouble());
		}
		HeapSortService.heap(figureArray, n1+n2);
		HeapSortService.heap(figureArray);
		System.out.println("\n�� ���� ��� 5���� ���� ������ ���� =");
		for(int i=0; i<figureArray.length; i++) {
			System.out.println(figureArray[i].toString());
		}
	}
}
