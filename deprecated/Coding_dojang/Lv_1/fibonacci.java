package Lv_1;
/*
작성일 : 2020-08-03

문제 : 피보나치 수열 구하기
피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
예) 0, 1, 1, 2, 3, 5, 8, 13
인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
링크 : http://codingdojang.com/scode/461?answer_mode=hide
*/

import java.util.Scanner;
import java.util.ArrayList;

public class fibonacci {
	int size;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//피보나치 함수 생성
	public fibonacci(int n) {
		this.size = n;
		list.add(0);
		list.add(1);
		if(size<1) {
			list.remove(1); //정수 0을 입력하였을 시 1삭제
		} else {
			for(int i=2; i<(size*3); i++) { //3이하의 수 입력시 오출력 방지를 위해 배열 크기 2배화
				list.add(list.get(i-2)+list.get(i-1));
				if(list.get(i)>size) {
					list.remove(i);
					break;
				}
			}
		}
			
	}
	//피보나치 함수 출력
	public void print() {
		System.out.println(size + " 이하 까지의 피보나치 수열");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			i = sc.nextInt();
			if(i<0) {
				System.out.println("0 이상의 정수 입력 필요");
			} else break;
		}
		fibonacci fi = new fibonacci(i);
		fi.print();		
	}

}
