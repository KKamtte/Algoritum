package Lv_1;
/*
작성일 : 2020-07-29

문제 : 게시판 페이징
A씨는 게시판 프로그램을 작성하고 있다.
A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
출력 : 총페이지수
A씨가 필요한 프로그램을 작성하시오.

링크 : http://codingdojang.com/scode/406?answer_mode=hide
*/
import java.util.Scanner;

public class borad_paging {
	public static void main(String args[]) {
		int n,m;
		double total;
		Scanner sc = new Scanner(System.in);
		System.out.print("총 입력 건수(m)와 페이지에 보여줄 게시물 수(n) 입력 : ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		if( m%n == 0) {
			System.out.println("총 페이지 수 : " + m/n);
		} else
			System.out.println("총 페이지 수 : " + (m/n+1));
	}
}
