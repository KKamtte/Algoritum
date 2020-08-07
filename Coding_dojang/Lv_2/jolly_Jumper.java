package Lv_2;
/*
�ۼ��� : 2020-08-07

���� : Jolly Jumpers
��ó : programming-challenges.com
n���� ����(n>0)�� �̷���� ������ ���� ���� ������ �ִ� �� ���� ���� 1���� n-1������ ���� ��� ������ �� ������ ������ ����(jolly jumper)��� �θ���. ���� ��� ������ ���� ��������
1 4 2 3
�� �ڿ� �ִ� ���� ���� ���� ���� ���� 3,2,1�̹Ƿ� �� ������ ������ ���۰� �ȴ�. � ������ ������ �������� �Ǵ��� �� �ִ� ���α׷��� �ۼ��϶�.

<Input>
�� �� �� �տ��� 3000 ������ ������ ������ �� �ڿ��� ������ ��Ÿ���� n���� ������ �Էµȴ�. �� �� ���ڰ� 0�̸� ����ϰ� �����Ѵ�.
<output>
�Էµ� �� �ٿ� ���� "Jolly" �Ǵ� "Not Jolly"�� �� �پ� ����Ѵ�

<Sample Input>
4 1 4 2 3
5 1 4 2 -1 6
�� ����: �� ���� �� ���� ���ڴ� ������ �����̴�. ù��° �Է��� 4 1 4 2 3 �� �� ���� 4�� �ڿ� 4���� ���ڰ� �´ٴ� ���� �ǹ���
<Sample Output>
Jolly
Not jolly
��ũ : http://codingdojang.com/scode/424?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;

public class jolly_Jumper {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//arraylist�� �� ���� ���� ���� �� ���밪�� ����
	public void makelist(int num1, int num2) {
		int num = num2 - num1;
		if(num<0)
			list.add(-num);
		else
			list.add(num);
	}
	
	//jolly���� Ȯ�� �Է°� -1�� �������� 1���� ���̸鼭 Ȯ��
	public boolean check_jolly(int num) {
		boolean check = true;
		for(int i=(num-1); i>0; i--) {
			if(list.indexOf(i)<0) {
				return false;
			}
		}
		return check;
	}
	
	public static void main(String args[]) {
		
		int[] array = new int[3000];
		jolly_Jumper jj = new jolly_Jumper();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� : ");
			array[0] = sc.nextInt();
			if(array[0]==0) {
				break;
			}
			
			for(int i=1; i<=array[0]; i++) {
				array[i] = sc.nextInt();
			}
			
			for(int i=1; i<array[0]; i++) {
				jj.makelist(array[i], array[i+1]);
			}
			if(jj.check_jolly(array[0])) {
				System.out.println("Jolly");
			} else
				System.out.println("Not jolly");
		break;}//while�� ����
	}
}
