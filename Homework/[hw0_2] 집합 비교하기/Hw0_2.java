/*
�� ���� ���� ���� ����(���� ��� �й�)�� �������� �˾ƺ��� �ڹ� ���α׷��� �ۼ��Ͻÿ�.
���� ����:
���� ���� ������ �� �� �Է� �޾� ���� ũ�Ⱑ 100�� �迭�� ������ �д�.
�� ��, -1�� ���� ���� ������ �ƴ� ���� �Է��ϸ� �� ���� �Է��� ��ģ ������ ����.
�� ������ ���� ������ �ִ� 100���� ����.
�����̹Ƿ� ������ ������ �߿����� �ʴ�.
����ڰ� ������ �� �Է��Ѵٰ� �����Ѵ�. ��, ����ڰ�  ������ ���Ҹ� �ߺ��Ͽ� �Է��ϴ� ���� ���ٰ� ����.
?�� ������ �������� ���θ� �˻��Ѵ�.
�Է�: ù��° ����, �ι�° ����
���: �� ������ �������� ����
 
����
�˰��� ���ο� �ռ� �ڹ� ���α׷��ְ� �ڷᱸ���� �����Ѵ�.
 
���� �� 1:
hw0_2 : ȫ�浿

���� ���� ������ ���ϴ� ���α׷��Դϴ�.
ù��° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ��� :  111  3  2  5  -1 
�ι�° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ��� :  3  2  5  111  -1 
�� ������ �����ϴ�.

���� ����
�� ���տ� ���� ũ�Ⱑ 100�� �⺻���� ������ �迭�� �̿��Ͽ� �ִ� 100���� ���� ������ �� �ֵ��� �ϼ���.
���ǹ�, �ݺ������� �̿��Ͽ� �ϳ� �ϳ� ���� ã�ƺ����� ���α׷��� �ۼ��ϼ���.
��, ArrayList���ڹٰ� �����ϴ� ��� �ڷ� ���� ����� �̿����� ������.
�� ������ ���� ������ 100 �̻� �Է��ϴ� ����� ó���� ���� �˾Ƽ� �� ��. �����ص� �ǰ�, ������ ó���ص� ��
*/

import java.util.Scanner;

public class Hw0_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hw0_2 : �����");
		System.out.println("���� ���� ������ ���ϴ� ���α׷��Դϴ�.");
		System.out.println("");
		
		int i = 0;
		int j = 0;
		int[] array1 = new int[100];
		int[] array2 = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		//ù��° ���� �Է¹���
		System.out.print("ù��° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ��� : ");
		for(i=0; i<100; i++) {
			int i1 = sc.nextInt();
			if(i1 > 0) {
				array1[i] = i1;
				//System.out.print("array1["+i+"] = "+array1[i]);
				//System.out.println("");
			}
			else {
				break;
			}
		}
		
		/* array1 �Է°�
		for(int i1=0; i1<i; i1++) {
			System.out.print(array1[i1]+" ");
		}
		
		System.out.println("�Է¿Ϸ�"+i);
		*/
		
		//ù��° ���� ũ��� ����
		for(int i1=0; i1<i-1; i1++) {
			for(int i2=i1+1; i2<i; i2++) {
				if(array1[i1] > array1[i2]) {
					int x = array1[i2];
					array1[i2] = array1[i1];
					array1[i1] = x;
				}
			}
		}
		
		/* array1 ���İ�
		for(int i1=0; i1<i; i1++) {
			System.out.print(array1[i1]+" ");
		}
		System.out.println("���ĿϷ�");
		*/
		
		//�ι�° ���� �Է¹���
		System.out.print("�ι�° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ��� : ");
		for(j=0; j<100; j++) {
			int j1 = sc.nextInt();
			if(j1 > 0) {
				array2[j] = j1;
				//System.out.print("array2["+j+"] = "+array2[j]);
				//System.out.println("");
			}
			else {
				break;
			}
		}
		
		/* array2 �Է°�
		for(int j1=0; j1<i; j1++) {
			System.out.print(array2[j1]+" ");
		}
		
		System.out.println("�Է¿Ϸ�"+j);
		*/
		
		//�ι�° ���� ũ��� ����
		for(int j1=0; j1<j-1; j1++) {
			for(int j2=j1+1; j2<j; j2++) {
				if(array2[j1] > array2[j2]) {
					int x = array2[j2];
					array2[j2] = array2[j1];
					array2[j1] = x;
				}
			}
		}
		
		/* array2 ���İ�
		for(int j1=0; j1<j; j1++) {
			System.out.print(array2[j1]+" ");
		}
		System.out.println("���ĿϷ�");
		*/
		
		//���պ�
		if(i == j) {
			//System.out.println("ũ�ⰰ��");
			for(i=0; i<j; i++) {
				if(array1[i] != array2[i]) {
					//System.out.println("array1["+i+"] = "+array1[i]+" && "+"array2["+i+"] = "+array2[i]);
					System.out.println("�� ������ �ٸ��ϴ�.");
					break;
				}else if(array1[i] == array2[j-1]) {
					System.out.println("�� ������ �����ϴ�.");
				}
			}
		}
		else {
			System.out.println("�� ������ �ٸ��ϴ�.");
		}
		//System.out.println("ũ��� �Ϸ�");
	}
	
}
