package Lv_2;
/*
�ۼ��� : 2020-08-05

���� : ���� �Ի繮�� �߿���
1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?
8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
(�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
��ũ : http://codingdojang.com/scode/393?answer_mode=hide
*/
public class one_to_tenthousand {

	public static void main(String args[]) {
		int k = 0;
		
		for(int i=1; i<=10000; i++) {
			for(int j=i; j>0; j /= 10) { //i���� j�� �޾� 10�� ������ 1�� �ڸ� ����
				if(j%10==8) k++;
			}
		}
		System.out.println(k);
	}
}
