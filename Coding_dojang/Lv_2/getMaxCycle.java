package Lv_2;
/*
�ۼ��� : 2020-08-06

���� : 3n+1 Problem
� ���� n���� ������, n�� ¦���� 2�� ������, Ȧ���� 3�� ���� ���� 1�� ���Ѵ�. �̷��� �ؼ� ���� ������� ���ڸ� n���� ����, n=1 �� �ɶ����� ���� �۾��� ��� �ݺ��Ѵ�. 
���� ���, n=22�̸� ������ ���� ������ ���������.
22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
n�̶�� ���� �ԷµǾ����� 1�� ���ö����� ������� ���� ����(1�� ����)�� n�� ����Ŭ ���̶�� �Ѵ�. 
���� �ִ� ������ ���� ��� 22�� ����Ŭ ���̴� 16�̴�. i�� j��� �ΰ��� ���� �־�������, i�� j������ ��� ��(i, j����)�� ���� �ִ� ����Ŭ ���̸� ���϶�.

<�Է� ��>
1    10
100  200
201  210
900  1000

<��� ��>
1    10    20
100  200   125
201  210   89
900  1000  174
��ũ : http://codingdojang.com/scode/393?answer_mode=hide
*/

import java.util.Scanner;
import java.util.ArrayList;

public class getMaxCycle {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� �Է� : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int maxSize = 0; //ó�� maxSize 0���� ����
		
		//����Ʈ ����
		for(int k=i; k<=j; k++) {
			list.clear(); //����Ʈ �ʱ�ȭ
			list.add(k);
			while(true) {
				if(list.get(list.size()-1)%2 == 0) { //¦���� ���
					list.add(list.get(list.size()-1)/2);
				}
				else { //Ȧ���ϰ��
					list.add(list.get(list.size()-1) * 3 + 1);
				}
				if(list.get(list.size()-1)==1) { //������ ���� 1�� ���
					if(list.size()>maxSize) { //���� ����Ʈ�� ���س��� ����Ʈ ũ�⺸�� Ŭ ���
						maxSize = list.size();
					}
					break;
				}
			}
		}
		System.out.print(i + " " + j + " " + maxSize);
	}
}
