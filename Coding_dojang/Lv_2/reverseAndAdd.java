package Lv_2;
/*
�ۼ��� : 2020-08-10

���� : Reverse And Add
��ó: programming-challenges
�ϴ� � ���� �޾Ƽ� �� ���� ������ ���� �������� ���� ������ ���� ���ϴ� ������ ����� ���ϱ��� �θ���. 
�� ���� ȸ��(palindrome, �յ� ��� �ʿ��� �о ���� ���� �Ǵ� �. ��:eye, madam, ���ָ������ּ�)�� �ƴϸ� ȸ���� �� ������ �� ������ �ݺ��Ѵ�.
���� ��� ó���� 195���� �����ؼ� ������ ���� �� �� ����� ���ϱ⸦ �ݺ��ϸ� 9339��� ȸ���� ���������.
 195      786       1473      5214
+591     +687      +3741     +4125
----     -----     -----     -----
 786     1473       5214      9339
��κ��� ������ �� ����� �� �ܰ踸 �ݺ��ϸ� ȸ���� �ȴ�. ������ ���ܵ� �ִ�. 
ȸ���� ã�� �� ���� ������ ������ ù��° ���� 196�̴�. ������ ȸ���� ���ٴ� ���� ����� ���� ����.
� ���� �־����� �� ȸ���� ������ ����ϰ�, �� ȸ���� ã����� ����� ���ϱ⸦ �ݺ��� Ƚ���� ����ϴ� ���α׷��� ������ �Ѵ�.
�׽�Ʈ �����ͷ� ���Ǵ� ���� ��� ����� ���ϱ⸦ 1,000�� �̸� �ݺ��ؼ� ȸ���� ã�� �� �ִ� ����, �׷��� ������� ȸ���� 4,294,967,295���� ũ�� �ʴٰ� �����ص� �ȴ�.

<Input>
ù��° �ٿ��� �׽�Ʈ ���̽��� ��Ÿ���� ���� N(0<N<=100)�� ����ְ�, �� �Ʒ��� N���� �ٿ� ���ļ� ȸ���� ���ؾ� �ϴ� ������ �� �ٿ� �ϳ��� ����ִ�.

<output>
N���� �� ������ ���� ȸ���� �߰��ϴ� �� �ʿ��� �ּ����� �ݺ� Ƚ���� ����ϰ�, �����̽��� �� ĭ ����� ����, �� ȸ���� ����Ѵ�.
<Sample Input>
3
195
265
750

<Sample Output>
4 9339
5 45254
3 6666
*/
import java.util.Scanner;

public class reverseAndAdd {
	String reverse;
	int temp = 0;
	
	//�Է°� ������
	public String reverse(int num) {
		this.reverse = ""; //reverse�� �ʱ�ȭ
		while(num>0) {
			this.reverse = reverse + num%10;
			num = num/10;
		}
		return reverse;
	}
	
	//���� ���� ������ ���� ��ġ�ϴ��� Ȯ��
	public boolean check_reverse(int num, int reverse) {
		if(num==reverse) {
			return true;
		} else {
			return false;
		}
	}
	
	//���簪 + ������ ��
	public int sum(int num, int reverse) {
		this.temp++;
		return (num+reverse);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		reverseAndAdd rev = new reverseAndAdd();
		int[] array;
		int temp=0;
		
		int num = sc.nextInt();
		array = new int[num];
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		
		while(temp<num) {
			String reverse = rev.reverse(array[temp]);
			if(rev.check_reverse(array[temp], Integer.parseInt(reverse))) { //������ ���� true���� Ȯ��
				System.out.println(rev.temp + " " + reverse);
				temp++; //���� �迭 ����
				rev.temp = 0; //�ݺ��� �ʱ�ȭ
			} else {
				array[temp] = rev.sum(array[temp], Integer.parseInt(reverse));
			}
		}
	}
}
