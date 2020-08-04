package Lv_2;
/*
�ۼ��� : 2020-08-04

���� : ���� �Ի繮�� �߿���
1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.
��ũ : http://codingdojang.com/scode/408?answer_mode=hide
*/

public class min_Distance {
	private static int[] S = {1, 4, 7, 11, 15, 19, 23, 26, 33, 40, 43, 46, 50};
	
	int distance;
	
	public void check_distance() {
		distance = S[1] - S[0]; //distance�� 1,2�� ���̷� �ʱ�ȭ
		for(int i=1; i<S.length; i++) {
			if((S[i]-S[i-1]<distance)){ //�Ÿ����� ª�� ���� �߰ߵ� ��� ����
				distance = S[i] - S[i-1];
			}
		}
	}
	
	public void print_answer() {
		for(int i=1; i<S.length; i++) {
			if((S[i]-S[i-1]) == distance) { //�ִܰŸ� ��� ���
				System.out.println("("+S[i-1]+", "+S[i]+")");
			}
		}
	}
	public static void main(String args[]) {
		min_Distance md = new min_Distance();
		md.check_distance();
		md.print_answer();
	}
}
