package Lv_2;
/*
작성일 : 2020-08-05

문제 : 리스트 회전
아래 조건에 따라 리스트를 회전하는 프로그램을 작성하시오.
<조건>
입력값은 한 행의 문자열로 주어지며, 각 값은 공백으로 구분된다.
첫 번째 값은 리스트를 회전하는 양과 방향(음수의 경우 좌측으로, 양수의 경우 우측으로 회전)이다.
첫 번째 값을 제외한 나머지 값은 리스트의 각 항목의 값이다.
회전된 리스트를 문자열로 출력한다.
구현에 이용할 자료구조에 대한 조건이나 제약은 없다.
입력되는 리스트의 항목의 개수는 유한한다.

<입출력예>
예 1)
입력: 1 10 20 30 40 50
출력: 50 10 20 30 40

예 2)
입력: 4 가 나 다 라 마 바 사
출력: 라 마 바 사 가 나 다

예 3)
입력: -2 A B C D E F G
출력: C D E F G A B

예 4)
입력: 0 똘기 떵이 호치 새초미
출력: 똘기 떵이 호치 새초미
링크 : http://codingdojang.com/scode/400?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class list_Rotation {
		
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		list_Rotation ro = new list_Rotation();
		System.out.print("입력 : ");
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(sc.nextLine().split(" ")));		
		int size = Integer.valueOf(list.getFirst());
		list.remove(); //리스트 내 작업 수 삭제
		
		//처음 입력값이 양수일 경우
		while(size > 0) {
			list.push(list.pollLast());
			size--;
		}
		//처음 입력값이 음수일 경우
		while(size < 0) {
			list.addLast(list.pollFirst());
			size ++;
		}
		
		System.out.print("출력 : ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}	
}
