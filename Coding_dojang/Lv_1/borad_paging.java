package Lv_1;
/*
�ۼ��� : 2020-07-29

���� : �Խ��� ����¡
A���� �Խ��� ���α׷��� �ۼ��ϰ� �ִ�.
A���� �Խù��� �� �Ǽ��� �� �������� ������ �Խù����� �Է����� �־��� �� �� ���������� �����ϴ� ���α׷��� �ʿ��ϴٰ� �Ѵ�.
�Է� : �ѰǼ�(m), ���������� ������ �Խù���(n) (�� n�� 1���� ũ�ų� ����. n >= 1)
��� : ����������
A���� �ʿ��� ���α׷��� �ۼ��Ͻÿ�.

��ũ : http://codingdojang.com/scode/406?answer_mode=hide
*/
import java.util.Scanner;

public class borad_paging {
	public static void main(String args[]) {
		int n,m;
		double total;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� �Ǽ�(m)�� �������� ������ �Խù� ��(n) �Է� : ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		if( m%n == 0) {
			System.out.println("�� ������ �� : " + m/n);
		} else
			System.out.println("�� ������ �� : " + (m/n+1));
	}
}
