package Lv_1;
/*
�ۼ��� : 2020-07-24

���� : ���� ���� ���ڷ� �ٲٱ�
A���� ���ߵ� �ҽ��ڵ带 Ư����ü�� ��ǰ�Ϸ��� �Ѵ�. ���ߵ� �ҽ��ڵ���� ������ �鿩���Ⱑ �Ȱ�, �������� �鿩���Ⱑ �� �͵��� ���� �ִٰ� �Ѵ�. 
A���� ������ �鿩���Ⱑ �� ��� �ҽ��� ���� 4���� ������ �� ��ǰ�� �����̴�.
A���� ������ �� �ֵ��� �ҽ��ڵ峻�� ���� ��(Tab) ���ڸ� ���� 4��(4 space)�� �ٲپ� �ִ� ���α׷��� �ۼ��Ͻÿ�.

��ũ : http://codingdojang.com/scode/405?answer_mode=hide
 */
import java.util.Scanner;

public class tapToSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڵ� �Է� : ");
		Scanner sc = new Scanner(System.in);
		String source = sc.next();
		
		source.replaceAll("\t", "    ");
		
		System.out.println(source);
	}

}
