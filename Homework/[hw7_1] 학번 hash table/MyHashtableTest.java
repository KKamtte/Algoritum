//���ϸ� : MyHashtableTest
//�ۼ��� : �����
//�ۼ��� : 2020-05-15
//���� : [hw7_1] �й� hash table

import java.util.Scanner;

public class MyHashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1 : �����");
		
		Scanner sc = new Scanner(System.in);
		int size, n, x, count;
		
		System.out.print("�ؽ����̺� ũ�� �Է� : ");
		size = sc.nextInt();
		MyHashtable ht = new MyHashtable(size);
		count = 0;
		
		while(true) {
			System.out.print("\n1.���� 2.�˻� 3.���� 4.���̺���� 5.����--->");
			n = sc.nextInt();
			
			if(n==1) {
				if(count==size){
					System.out.println("�迭�� ���� á���ϴ�.");
				}
				else {
					System.out.print("������ �й�(������)�� �Է��ϼ���:");
					x = sc.nextInt();
					if(ht.put(x)) {
						System.out.println(x + " ���� ����");
						count += 1;
					}
					else
						System.out.println(x + " ���� ����");
				}
			}
			else if(n==2) {
				System.out.print("�˻��� �й�(������)�� �Է��ϼ���:");
				x = sc.nextInt();
				if(ht.contain(x))
					System.out.println(x + " �˻� ����");
				else
					System.out.println(x + " �˻� ����");
			}
			else if(n==3) {
				System.out.print("������ �й�(������)�� �Է��ϼ���:");
				x = sc.nextInt();
				if(ht.remove(x)) {
					System.out.println(x + " ���� ����");
					count -= 1;
				}					
				else
					System.out.println(x + " ���� ����");
			}
			else if(n==4) {
				ht.print();
			}
			else if(n==5) {
				break;
			}
		}
	}

}
