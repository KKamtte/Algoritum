//���ϸ� : MyBinarySearchTreeTest
//�ۼ��� : �����
//�ۼ��� : 2020-05-01
//���� : [hw6_1] binary search tree

import java.util.Scanner;

public class MyBinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : �����\n���ð��� �����߽��ϴ�.");
		MyBinarySearchTree bt = new MyBinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("\n�����۾� ���� \n1.���� 2.�˻� 3.���� 4.��ü��ȸ 5.���� : ");
			n = sc.nextInt();
			
			if(n==1) {
				System.out.print("(����)���̵� �Է� : ");
				String id = sc.next();
				//System.out.println(bt.add(id));
				if(bt.add(id)==true) {
					System.out.println("���̵� �߰��� �����Ͽ����ϴ�.");
				} else {
					System.out.println("���̵� �߰��� �����Ͽ����ϴ�.");
				}
			} else if(n==2) {
				System.out.print("(�˻�)���̵� �Է� : ");
				String id = sc.next();
				//System.out.println(bt.contain(id));
				if(bt.contain(id)==true) {
					System.out.println("�����ϴ� ���̵� �Դϴ�.");
				} else {
					System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				}
			} else if(n==3) {
				System.out.print("(����)���̵� �Է� : ");
				String id = sc.next();
				//System.out.println(bt.remove(id));
				if(bt.remove(id)==true) {
					System.out.println("���̵� ������ �����Ͽ����ϴ�.");
				} else {
					System.out.println("���̵� ������ �����Ͽ����ϴ�.");
				}
			} else if(n==4) {
				bt.print();
			} else if(n==5) {
				break;
			}
		}
	}

}
