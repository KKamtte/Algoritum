package Lv_2;
/*
�ۼ��� : 2020-08-12

���� : Largest prime factor
��ó : http://projecteuler.net/problem=3, �ѱ��� ����Ʈ
������Ʈ ���Ϸ� 3��° ����
� ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �Ѵ�.
���� ��� 13195�� ���μ��� 5, 7, 13, 29 �̴�.
600851475143�� ���μ� �߿��� ���� ū ���� ���Ͻÿ�.
��ũ : http://codingdojang.com/scode/450?answer_mode=hide
*/
import java.util.LinkedList;

public class largestPrimeFactor {
	private static LinkedList<Long> list = new LinkedList<Long>();
	
	private static void getPrime(long num) {
		for(long i = 2l; i<=num; i++) {
			if(num%i == 0) {
				list.add(i); //���μ� ����Ʈ�� �߰�
				num = num/i; //���� ū ���μ��� ���ϱ� ���� �׳� ������ ���
				//getPrime(num/i) //��� ȣ�� ���� -> ��� ���μ��� ���� �� ���
				//break; //��� ȣ�� ����
			}
		}
	}
	public static void main(String args[]) {
		
		long num = 600851475143l;
		
		getPrime(num);
		System.out.println(list.get(list.size()-1));
	}
}
