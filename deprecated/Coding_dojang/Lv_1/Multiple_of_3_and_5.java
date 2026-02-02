package Lv_1;
/*
작성일 : 2020-07-24

문제 : Multiple of 3 and 5
10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
1000미만의 자연수에서 3,5의 배수의 총합을 구하라.

링크 : http://codingdojang.com/scode/350?answer_mode=hide
*/



public class Multiple_of_3_and_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<1000; i++) {
			if( (i % 3) == 0) //3으로 나눠지는 수
				sum += i;
			else if( (i % 5) == 0) //5로 나눠지는 수
				sum += i;
		} 
		
		System.out.println(sum);
	}

}
