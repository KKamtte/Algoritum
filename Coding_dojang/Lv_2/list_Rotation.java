package Lv_2;
/*
�ۼ��� : 2020-08-05

���� : ����Ʈ ȸ��
�Ʒ� ���ǿ� ���� ����Ʈ�� ȸ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
<����>
�Է°��� �� ���� ���ڿ��� �־�����, �� ���� �������� ���еȴ�.
ù ��° ���� ����Ʈ�� ȸ���ϴ� ��� ����(������ ��� ��������, ����� ��� �������� ȸ��)�̴�.
ù ��° ���� ������ ������ ���� ����Ʈ�� �� �׸��� ���̴�.
ȸ���� ����Ʈ�� ���ڿ��� ����Ѵ�.
������ �̿��� �ڷᱸ���� ���� �����̳� ������ ����.
�ԷµǴ� ����Ʈ�� �׸��� ������ �����Ѵ�.

<����¿�>
�� 1)
�Է�: 1 10 20 30 40 50
���: 50 10 20 30 40

�� 2)
�Է�: 4 �� �� �� �� �� �� ��
���: �� �� �� �� �� �� ��

�� 3)
�Է�: -2 A B C D E F G
���: C D E F G A B

�� 4)
�Է�: 0 �ʱ� ���� ȣġ ���ʹ�
���: �ʱ� ���� ȣġ ���ʹ�
��ũ : http://codingdojang.com/scode/400?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class list_Rotation {
		
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		list_Rotation ro = new list_Rotation();
		System.out.print("�Է� : ");
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(sc.nextLine().split(" ")));		
		int size = Integer.valueOf(list.getFirst());
		list.remove(); //����Ʈ �� �۾� �� ����
		
		//ó�� �Է°��� ����� ���
		while(size > 0) {
			list.push(list.pollLast());
			size--;
		}
		//ó�� �Է°��� ������ ���
		while(size < 0) {
			list.addLast(list.pollFirst());
			size ++;
		}
		
		System.out.print("��� : ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}	
}
