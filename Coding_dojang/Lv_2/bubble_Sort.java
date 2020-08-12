package Lv_2;
/*
�ۼ��� : 2020-08-12

���� : bubble sort
���� : http://www.codeabbey.com/index/task_view/bubble-sort
�迭�� �����ϴ� ���� �ʺ� ���α׷��ӿ��� ������ �����̸� �������� ���α׷���(�����ͺ��̽�, ���̺귯����)������ �ſ� �߿��ϰ� �ٷ�� ����.
������ �񱳿� ����� �ξ� �迭�� �� �����ϴ� ����̴�. ������ �迭�� ������ ����.
a = [3, 1, 4, 1, 5, 9, 2, 6]
�츮�� �� �迭�� ũ�� ������� �����ϰ� �ʹ�. (������ ��Ҵ� ������ ��Һ��� �۰ų� ���ƾ� �Ѵ�.)
���������� ǥ�����ڸ� ������ ����.
i < j, a[i] <= a[j]
�ε��� i�� j���� ���� ��� �迭�� ���� a[i]�� a[j]������ �۰ų� ���ƾ� �Ѵ�.
�����Ʈ(Bubble Sort)�� �̷��� ������ �ϱ� ���� ���� ������ ��� �� �ϳ��̴�. �� ������ ����� ������ ����:
�迭�� ���󰡸� ������ ���� ã�´�. (N���� �迭�� ���� ��� N-1���� ���� �����ϰ� �ȴ�)
���� a[i] <= a[i+1] �� �������� �ʴ� ���� ã�� �Ǹ� �� ���� ���� ���� �ٲپ��ش�. (Swap)
�� �̻� �ٲپ�� �� ���� �������� ���� ������ 1��, 2���� �ݺ��Ѵ�. (Loop)
i�� j��� �ε����� ���� �� ���� ���� ���� �ٲٱ�(Swap) ���ؼ��� ��� ����� �ִµ� �ӽ� ������ ����ϴ� ���� ������ ����:
t = a[i]
a[i] = a[j]
a[j] = t
�Է°� ���
�Է� �������� ù��° ������ �迭�� ������ �ǹ��ϸ� �ι�° ������ �迭�� ��Ұ��� �ǹ��Ѵ�.
��� �����ʹ� �ΰ��� ������ �̷������.
ù��° ���� �迭�� ���� ����(Loop)�� Ƚ���̸� �ι�° ���� Swap�� �߻��� �� Ƚ���̴�.
������ ����� �����̴�:
input data:
8
3 1 4 1 5 9 2 6
answer:
5 8

��ũ : http://codingdojang.com/scode/448?answer_mode=hide
*/
import java.util.Scanner; 

public class bubble_Sort {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array;
		int temp,loop_time=0, swap = 0;
		//temp = �ӽ������
		//loop_time = loop ���� Ƚ��
		//swap = swap ���� Ƚ��
		System.out.println("input data : ");
		int size = sc.nextInt();
		array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		boolean loop_end; //loop�� ������ ����

		while(true) {
			loop_end = true; //������ �����ٰ� ����
			loop_time++;
			//System.out.println("loop " + loop_time + " ȸ"); //���� Ƚ�� Ȯ��
			
			for(int i=0; i<(size-1); i++) {
				if(array[i]>array[i+1]) { //�迭 ���� ���ĵǾ����� ���� ���
					loop_end=false; //������ ������ �ʴ´ٰ� ����
					swap++;
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					//System.out.print("swap " + swap + " ȸ �߻� : "); //swap Ƚ�� Ȯ��
					/*
					for(int k=0; k<size; k++) {							
						System.out.print(array[k] + " "); //swap�� �Ͼ ��� ������ �ϰ� ���� ���� ���
					}
					System.out.println();
					*/
				}
			}
			
			if(loop_end) break; //������ �Ϸ�� ��� Ż��
		}
		
		System.out.println("\nanswer : \n" + loop_time +" " + swap);
	}
}
