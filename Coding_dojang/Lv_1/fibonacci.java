package Lv_1;
/*
�ۼ��� : 2020-08-03

���� : �Ǻ���ġ ���� ���ϱ�
�Ǻ���ġ �����̶�, ù ��° ���� ���� 0�̰� �� ��° ���� ���� 1�� ��, ������ �׵��� ������ �� ���� ���� ������ �̷������ ������ ���Ѵ�.
��) 0, 1, 1, 2, 3, 5, 8, 13
��ǲ�� ���� n���� �޾�����, n ���ϱ����� �Ǻ���ġ ������ ����ϴ� ���α׷��� �ۼ��ϼ���
��ũ : http://codingdojang.com/scode/461?answer_mode=hide
*/

import java.util.Scanner;
import java.util.ArrayList;

public class fibonacci {
	int size;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//�Ǻ���ġ �Լ� ����
	public fibonacci(int n) {
		this.size = n;
		list.add(0);
		list.add(1);
		if(size<1) {
			list.remove(1); //���� 0�� �Է��Ͽ��� �� 1����
		} else {
			for(int i=2; i<(size*3); i++) { //3������ �� �Է½� ����� ������ ���� �迭 ũ�� 2��ȭ
				list.add(list.get(i-2)+list.get(i-1));
				if(list.get(i)>size) {
					list.remove(i);
					break;
				}
			}
		}
			
	}
	//�Ǻ���ġ �Լ� ���
	public void print() {
		System.out.println(size + " ���� ������ �Ǻ���ġ ����");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		while(true) {
			System.out.print("������ �Է��ϼ��� : ");
			i = sc.nextInt();
			if(i<0) {
				System.out.println("0 �̻��� ���� �Է� �ʿ�");
			} else break;
		}
		fibonacci fi = new fibonacci(i);
		fi.print();		
	}

}
