package Lv_1;
/*
�ۼ��� : 2020-07-31

���� : ���� ��ȭ���� ����
n���� ������ ���� �迭�� �ִ�. �� �迭�� ���������� ���� ������ ��� ������ �ִ�. ���� ����� �� �迭�� �� Ư���� ������� �����ؾ� �Ѵ�.
������ �ǰ� �� ��, ���� ������ ���ʿ� ���������� ���ʿ� �־�� �Ѵ�. ���� ���������� ���������� �������� ������ ����� �Ѵ�.
��. -1 1 3 -2 2 ans: -1 -2 1 3 2.

��ũ : http://codingdojang.com/scode/414?answer_mode=hide
*/

import java.util.ArrayList;

public class special_Sort {
	
	public special_Sort() {}
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void change() {
		for(int i=1; i<list.size(); i++) {
			if(list.get(i)<0) {
				for(int j=(i-1); j>=0; j--) {
					if(list.get(j)<0) {
						list.add(j+1, list.get(i));
						list.remove(i+1);
						break;
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		//-1 1 3 -2 2 //-1 -2 1 3 -2 2 // -1 -2 1 3 2
 		special_Sort st = new special_Sort();
		st.list.add(-1); st.list.add(1); st.list.add(3); st.list.add(-2); st.list.add(2);
		System.out.println(st.list);
		st.change();
		System.out.println(st.list);
	}
}
