package Lv_1;
/*
�ۼ��� : 2020-07-24

���� : Multiple of 3 and 5
10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.

��ũ : http://codingdojang.com/scode/350?answer_mode=hide
*/



public class Multiple_of_3_and_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<1000; i++) {
			if( (i % 3) == 0) //3���� �������� ��
				sum += i;
			else if( (i % 5) == 0) //5�� �������� ��
				sum += i;
		} 
		
		System.out.println(sum);
	}

}
