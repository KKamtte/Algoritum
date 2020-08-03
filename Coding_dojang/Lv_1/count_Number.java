package Lv_1;
/*
작성일 : 2020-08-04

문제 : 1~1000 에서 각 숫자의 개수 구하기
예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
10 = 1, 0
11 = 1, 1
12 = 1, 2
13 = 1, 3
14 = 1, 4
15 = 1, 5
그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
링크 : http://codingdojang.com/scode/504?answer_mode=hide
*/
public class count_Number {
	int[] array = new int[10];
	
	public void make_count() {
		for(int i=1; i<=1000; i++) {
			array[i%10]++;
			if(i>=10) array[(i/10)%10]++; //10의 자리
			if(i>=100) array[(i/100)%10]++; //100의 자리
			if(i>=1000) array[(i/1000)%10]++; //1000의 자리
		}			
	}
	
	public void print() {
		for(int i=0; i<array.length; i++) {
			System.out.print(i + ":" + array[i] + "개  ");
		}
	}
	public static void main(String args[]) {
		count_Number cn = new count_Number();
		cn.make_count();
		cn.print();
	}
}
