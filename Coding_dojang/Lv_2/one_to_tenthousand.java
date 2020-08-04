package Lv_2;
/*
작성일 : 2020-08-05

문제 : 구글 입사문제 중에서
1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
링크 : http://codingdojang.com/scode/393?answer_mode=hide
*/
public class one_to_tenthousand {

	public static void main(String args[]) {
		int k = 0;
		
		for(int i=1; i<=10000; i++) {
			for(int j=i; j>0; j /= 10) { //i값을 j로 받아 10씩 나누어 1의 자리 조사
				if(j%10==8) k++;
			}
		}
		System.out.println(k);
	}
}
