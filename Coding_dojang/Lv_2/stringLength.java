package Lv_2;
/*
�ۼ��� : 2020-08-13

���� : ���ڿ� �����ϱ�
���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.
�Է� ����: aaabbcccccca
��� ����: a3b2c6a1

��ũ : http://codingdojang.com/scode/465?answer_mode=hide
*/
import java.util.Scanner;

public class stringLength {
	
	public static void main(String args[]) {
		
		//���� aaabbcccccca
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String s = sc.next();
		String zip;
		zip = s.substring(0,1); //�Է¹��� ���ڿ� �� ù��° ���ڸ� �߶� ����
		int count=1; //��ġ�ϴ� ������ ������ �����ִ� ���� ù��° ���ڰ� �ּ� 1���� 1�� �ʱ�ȭ
		
		System.out.print("��� : ");
		for(int i=1; i<s.length(); i++) { //�Է¹��� ���ڿ� �� �ι�° ���ڿ����� ��ġ�ϴ��� �˻�
			if(zip.matches(s.substring(i, i+1))) {
				count++; //��ġ�Ѵٸ� count�� ����
			}
			else {
				System.out.print(zip + count); //��ġ���� �ʴ´ٸ� ���ڿ��� ����ϰ� ��ġ�ϴ� ���ڸ�ŭ ���
				zip = s.substring(i,i+1); //���ο� ���ڿ��� ����
				count = 1; //count ���� 1�� �ʱ�ȭ
			}
		}
		System.out.println(zip+count); //���������� ���� ���ڿ� ���� ���
	}
}
