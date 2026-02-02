package Lv_2;
/*
작성일 : 2020-08-07

문제 : 그 시간에 사무실에 몇 명이 있었나? 
출처: http://www.careercup.com/question?id=13817668
아마존 면접문제
A사무실에는 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.
파일의 형식은 다음과 같다. (한 라인에서 앞부분은 출근시간(HH:MM:SS), 뒷부분은 퇴근시간이다)
09:12:23 11:14:35
10:34:01 13:23:40
10:34:31 11:20:10
특정시간을 입력(예:11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 알려주는 함수를 작성하시오.
링크 : http://codingdojang.com/scode/418?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;

public class inOfficeRoom {
	
	//사무실 출퇴근 시간
	String[][] array = new String[][] {
		{"09:12:23", "11:14:35"},
		{"10:34:01", "13:23:40"},
		{"10:34:31", "11:20:10"}
	};
	
	//사무실에 있었는지 확인하고 결과 수를 리턴
	public int check(String str) {
		int inpeople=0;
		for(int i=0; i<array.length; i++) {
			if(compare(array[i][0], str) && compare(str, array[i][1])) { //출근 및 퇴근시간 사이에 있다는 조건을 동시에 만족하는지 검사
				inpeople++;
			}
		}
		return inpeople;
	}
	
	//사무실에 있었으면 true없으면 false를 리턴
	public boolean compare(String str1, String str2) {
		if(str1.compareTo(str2)<=0) { //str1(출근시간/검색시간) : str2(검색시간/퇴근시간) str1이 작거나 같은경우 사무실에 있었음
			return true;
		}else return false;
	}
	
	public static void main(String args[]) {
		
		inOfficeRoom office = new inOfficeRoom();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간 입력(HH:MM:SS) : ");
		String time = sc.next();
		
		System.out.println("사무실에 있었던 인원은 총 " + office.check(time) + " 입니다.");	
	}
}
