//���ϸ� : SelectionNumber
//�ۼ��� : �����
//�ۼ��� : 2020-04-24
//���� : [hw5_1] ���� �˰���

import java.util.Scanner;

public class SelectionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("hw5_1 : �����");
		System.out.print("\n�������� �Է� : ");
		int n = sc.nextInt(); //���� ���� ����
		
		//�迭���� �� ���� �Է¹���
		int[] num = new int[n];
		
		System.out.print(n + "���� ���� �Է� : ");
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		//�������� ����
		for(int i=0; i<num.length-1; i++) {
			int x = num[i]; //�ʱ� �ּҰ� ����
			int swap=i;
			//�ּҰ� ���� �˰��� ����
			for(int j=i+1; j<num.length; j++) {
				if(x > num[j]) {
					x = num[j];
					swap = j;
				}
			}
			//swap ����
			//System.out.println("\n\n�۾����� = ["+i+"]�� "+num[i]+" �׸��� ["+swap+"]�� "+num[swap]+"�� �����");
			num[swap] = num[i];
			num[i] = x;
			/*
			for(int k=0; k<num.length; k++) {
				System.out.print(num[k]+" ");
			}
			*/
		}
		//�߾Ӱ� ���
		System.out.println("�߾Ӱ� = " + num[(n-1)/2]);
	}

}
