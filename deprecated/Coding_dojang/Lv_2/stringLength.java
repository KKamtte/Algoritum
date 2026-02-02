package Lv_2;
/*
작성일 : 2020-08-13

문제 : 문자열 압축하기
문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
입력 예시: aaabbcccccca
출력 예시: a3b2c6a1

링크 : http://codingdojang.com/scode/465?answer_mode=hide
*/
import java.util.Scanner;

public class stringLength {
	
	public static void main(String args[]) {
		
		//예시 aaabbcccccca
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String s = sc.next();
		String zip;
		zip = s.substring(0,1); //입력받은 문자열 중 첫번째 문자를 잘라서 저장
		int count=1; //일치하는 문자의 개수를 세어주는 변수 첫번째 문자가 최소 1개라서 1로 초기화
		
		System.out.print("출력 : ");
		for(int i=1; i<s.length(); i++) { //입력받은 문자열 중 두번째 문자열부터 일치하는지 검색
			if(zip.matches(s.substring(i, i+1))) {
				count++; //일치한다면 count값 증가
			}
			else {
				System.out.print(zip + count); //일치하지 않는다면 문자열을 출력하고 일치하는 문자만큼 출력
				zip = s.substring(i,i+1); //새로운 문자열을 저장
				count = 1; //count 값을 1로 초기화
			}
		}
		System.out.println(zip+count); //마지막으로 남은 문자와 개수 출력
	}
}
