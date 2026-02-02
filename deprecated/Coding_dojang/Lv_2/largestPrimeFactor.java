package Lv_2;
/*
작성일 : 2020-08-12

문제 : Largest prime factor
출처 : http://projecteuler.net/problem=3, 한국어 사이트
프로젝트 오일러 3번째 문제
어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 한다.
예를 들면 13195의 소인수는 5, 7, 13, 29 이다.
600851475143의 소인수 중에서 가장 큰 수를 구하시오.
링크 : http://codingdojang.com/scode/450?answer_mode=hide
*/
import java.util.LinkedList;

public class largestPrimeFactor {
	private static LinkedList<Long> list = new LinkedList<Long>();
	
	private static void getPrime(long num) {
		for(long i = 2l; i<=num; i++) {
			if(num%i == 0) {
				list.add(i); //소인수 리스트에 추가
				num = num/i; //가장 큰 소인수를 구하기 위해 그냥 나누기 사용
				//getPrime(num/i) //재귀 호출 사용시 -> 모든 소인수를 구할 때 사용
				//break; //재귀 호출 사용시
			}
		}
	}
	public static void main(String args[]) {
		
		long num = 600851475143l;
		
		getPrime(num);
		System.out.println(list.get(list.size()-1));
	}
}
