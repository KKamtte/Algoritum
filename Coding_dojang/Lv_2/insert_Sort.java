package Lv_2;
/*
�ۼ��� : 2020-08-11

���� : Insertion Sort
�� �׸��� {5,2,4,6,1,3} �̶�� �迭�� ��Ʈ�ϴ� ����� �����ش�.

�迭�� �ι�° �ε������� �����Ͽ� ������ �ε���(������ ���) ������ �׸� �� �ڽ��� ���� �� ��ġ�� �Ǵ�(��Ʈ�ǵ���)�Ͽ� �̵� �Ѵ�.
������ �迭 ��ҵ��� ���κ��� ������ ���� ���ԵǾ� ���� ��� ��ĭ�� �������� �̵��Ѵ�. ��, ���ԵǾ� ������ ���(�׸����� ������ ���)�� �ִ� �ε���(������ ��ġ)������ �̵��Ѵ�.
������ �ε������� �� ������ �ݺ��Ѵ�.
�̿� ���� ����� �ϴ� ��Ʈ ���α׷��� �ۼ��Ͻÿ�.

��ũ : http://codingdojang.com/scode/443?answer_mode=hide
*/
public class insert_Sort {
	
	public static void main(String args[]) {
		int[] array = {5, 2, 4, 6, 1, 3}; //�ʱ� �迭
		int swap_area=0, temp=0; //�ʱ� swap��
		boolean sort = false; //sort�� �Ͼ�� �Ǵ��� �Ǵ��ϴ� �οﰪ
		
		for(int i=1; i<array.length; i++) {
			for(int j=(i-1); j>=0; j--) {
				if(array[i]<array[j]) { //sort�� �Ͼ�� �Ǵ��� �Ǵ�
					temp = array[i];
					swap_area = j;
					sort = true; //sort�� �Ͼ�� �� ��� true�� �ٲ���
				}
			}
			
			//������ �ʿ��� ���
			if(sort) { //�� �迭�� ���� �ϳ��� �ڷ� �̷�
				for(int j=i; j>swap_area; j--) {
					array[j] = array[j-1];
				}
				array[swap_area] = temp; //���� �� �ڸ��� �迭���� �־���
				sort = false; //������ �������� sort�� �ٽ� false�� �ٲ���
			}
			
			//���� �� ����� ����� ��
			System.out.print(i + "�� ° ���� ���\n{ ");
			for(int j=0; j<array.length; j++)
				System.out.print(array[j] + " ");
			System.out.print("}\n");
		}
	}
}
