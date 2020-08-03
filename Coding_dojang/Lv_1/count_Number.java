package Lv_1;
/*
�ۼ��� : 2020-08-04

���� : 1~1000 ���� �� ������ ���� ���ϱ�
���� 10 ~ 15 ������ �� ������ ������ ���غ���
10 = 1, 0
11 = 1, 1
12 = 1, 2
13 = 1, 3
14 = 1, 4
15 = 1, 5
�׷��Ƿ� �� ����� ���� 0:1��, 1:7��, 2:1��, 3:1��, 4:1��, 5:1��
��ũ : http://codingdojang.com/scode/504?answer_mode=hide
*/
public class count_Number {
	int[] array = new int[10];
	
	public void make_count() {
		for(int i=1; i<=1000; i++) {
			array[i%10]++;
			if(i>=10) array[(i/10)%10]++; //10�� �ڸ�
			if(i>=100) array[(i/100)%10]++; //100�� �ڸ�
			if(i>=1000) array[(i/1000)%10]++; //1000�� �ڸ�
		}			
	}
	
	public void print() {
		for(int i=0; i<array.length; i++) {
			System.out.print(i + ":" + array[i] + "��  ");
		}
	}
	public static void main(String args[]) {
		count_Number cn = new count_Number();
		cn.make_count();
		cn.print();
	}
}
