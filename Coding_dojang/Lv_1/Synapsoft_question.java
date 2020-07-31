package Lv_1;
/*
작성일 : 2020-07-30

문제 : 사이냅소프트 면접문제
주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
[이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌]
1. 김씨와 이씨는 각각 몇 명 인가요?
2. "이재영"이란 이름이 몇 번 반복되나요?
3. 중복을 제거한 이름을 출력하세요.
4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

링크 : http://codingdojang.com/scode/410?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Synapsoft_question {
	
	String result;
	ArrayList<String> list = new ArrayList<String>();
	int kim = 0, lee = 0, leejaeyong=0;
	
	public void list(String str) {
		while(true) {
			if(str.indexOf(",") != -1) {
				result = str.substring(0,str.indexOf(","));
				str = str.substring(str.indexOf(",")+1);
				list.add(result);
			} else {
				list.add(str);
				break;
			}
		}
	}
	
	public void check_name() {
		for(int i=0; i<list.size(); i++) {
			if("김".equals(list.get(i).substring(0,1))) {
				kim++;
			} else if("이재영".equals(list.get(i))) {
				leejaeyong++;
				lee++;
			} else if("이".equals(list.get(i).substring(0,1))) {
				lee++;
			}
		}
	}
	public void remove() {
		for(int i=0; i<list.size()-1; i++) {
			for(int j=(i+1); j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					//System.out.println(i+"번째의 "+list.get(i) + " 와" + j+"번째의 "+list.get(j)+" 가 중복되어 삭제함");
					list.remove(j);
				}
			}
		}
	}
	
	public void change() {
		for(int i=0; i<list.size()-1; i++) {
			for(int j=(i+1); j<list.size(); j++) {
				if(list.get(i).compareTo(list.get(j)) > 0) {
					list.add(i,list.get(j));
					list.add(j+1,list.get(i+1));
					list.remove(i+1);
					list.remove(j+1);
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Synapsoft_question sq = new Synapsoft_question();
		//System.out.println("입력 : ");
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		//이유덕, 이재영, 권종표, 박민호, 강상희, 김지완, 최승혁, 이성연, 박영서, 전경헌, 송정환, 김재성
		sq.list(str);
		sq.check_name();
		System.out.println("성이 '김' 인 사람의 수 : " +sq.kim);
		System.out.println("성이 '이' 인 사람의 수 : " +sq.lee);
		System.out.println("이재영의 수 : " + sq.leejaeyong);
		sq.remove();
		System.out.println("중복을 제거한 이름 출력 ");
		System.out.println(sq.list);
		sq.change();
		System.out.println("오름차순으로 정렬 후 출력");
		System.out.println(sq.list);
	}
}
