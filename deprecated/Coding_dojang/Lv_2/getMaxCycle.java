package Lv_2;
/*
작성일 : 2020-08-06

문제 : 3n+1 Problem
어떤 정수 n에서 시작해, n이 짝수면 2로 나누고, 홀수면 3을 곱한 다음 1을 더한다. 이렇게 해서 새로 만들어진 숫자를 n으로 놓고, n=1 이 될때까지 같은 작업을 계속 반복한다. 
예를 들어, n=22이면 다음과 같은 수열이 만들어진다.
22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
n이라는 값이 입력되었을때 1이 나올때까지 만들어진 수의 개수(1을 포함)를 n의 사이클 길이라고 한다. 
위에 있는 수열을 예로 들면 22의 사이클 길이는 16이다. i와 j라는 두개의 수가 주어졌을때, i와 j사이의 모든 수(i, j포함)에 대해 최대 사이클 길이를 구하라.

<입력 예>
1    10
100  200
201  210
900  1000

<출력 예>
1    10    20
100  200   125
201  210   89
900  1000  174
링크 : http://codingdojang.com/scode/393?answer_mode=hide
*/

import java.util.Scanner;
import java.util.ArrayList;

public class getMaxCycle {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수 입력 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int maxSize = 0; //처음 maxSize 0으로 설정
		
		//리스트 생성
		for(int k=i; k<=j; k++) {
			list.clear(); //리스트 초기화
			list.add(k);
			while(true) {
				if(list.get(list.size()-1)%2 == 0) { //짝수일 경우
					list.add(list.get(list.size()-1)/2);
				}
				else { //홀수일경우
					list.add(list.get(list.size()-1) * 3 + 1);
				}
				if(list.get(list.size()-1)==1) { //마지막 값이 1일 경우
					if(list.size()>maxSize) { //현재 리스트가 구해놓은 리스트 크기보다 클 경우
						maxSize = list.size();
					}
					break;
				}
			}
		}
		System.out.print(i + " " + j + " " + maxSize);
	}
}
