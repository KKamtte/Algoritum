package Lv_2;
/*
�ۼ��� : 2020-08-10

���� : Ones 
��ó: programming challenges
2�� 5�� ���� �� ���� 0 �̻� 10,000 ������ ���� n�� �־����µ�, n�� ��� �߿��� 10������ ǥ������ �� ��� �ڸ� ���ڰ� 1�� ���� �ִ�.
�׷��� n�� ��� �߿��� ���� ���� ���� �� �ڸ� ���ϱ�?
<Sample Input>
3
7
9901
<Sample Output>
3
6
12
*/
import java.util.Scanner;

public class ones {
	String div = "1";
	long div_num;
	
	public void div(int k) {
		div_num = Long.parseLong(div); //stringŸ������ ������ div�� longŸ������ ��ȯ 
		if((div_num/k * k) == div_num) { //������ ���� �ٽ� ���Ͽ��� ��� ���� ���ڰ� ������ �� �˻�
			System.out.println(div.length());
			} 
		else {
			this.div = div + "1"; //1->11, 11->111���� 1�� �ٿ��� ���� �ϵ��� ��
			div(k);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ones ones = new ones();
		while(true) {
			System.out.print("�����Է� : ");
			int num = sc.nextInt();
			if((num/2 * 2) == num || (num/5 * 5) == num) {
				System.out.println("2�� 5�� ������");
			} else {
				ones.div(num);
				break;
			}
		}
	}
}
