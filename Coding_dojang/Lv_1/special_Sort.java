package Lv_1;
/*
작성일 : 2020-07-31

문제 : 구글 전화면접 문제
n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
예. -1 1 3 -2 2 ans: -1 -2 1 3 2.

링크 : http://codingdojang.com/scode/414?answer_mode=hide
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
