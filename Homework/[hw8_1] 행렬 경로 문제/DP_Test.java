//���ϸ� : DP_Test.java
//�ۼ��� : �����
//�ۼ��� : 2020-05-29
//���� : [hw8_1] ��� ��� ����

import java.util.Scanner;

public class DP_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw8_1 : �����");
		System.out.println("���ð��� �����߽��ϴ�.");
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� ũ�� �Է� : ");
		n = sc.nextInt();
		DynamicProgramming dp = new DynamicProgramming(n);
		
		System.out.println("\n" + n + " x " + n + "ũ���� ��� ���� �Է� :");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				dp.matrix(i,j,sc.nextInt());
			}
		}
		dp.makeDPresult();
		
		System.out.print("\n�ִ� ���� = ");
		dp.printDP();
		System.out.print("�ִ� ���� ��� = ");
		dp.printDProad();
	}

}
