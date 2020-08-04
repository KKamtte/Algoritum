package Lv_2;
/*
작성일 : 2020-08-04

문제 : 다음 입사문제 중에서
1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
링크 : http://codingdojang.com/scode/408?answer_mode=hide
*/

public class min_Distance {
	private static int[] S = {1, 4, 7, 11, 15, 19, 23, 26, 33, 40, 43, 46, 50};
	
	int distance;
	
	public void check_distance() {
		distance = S[1] - S[0]; //distance값 1,2의 길이로 초기화
		for(int i=1; i<S.length; i++) {
			if((S[i]-S[i-1]<distance)){ //거리값이 짧은 쌍이 발견될 경우 변경
				distance = S[i] - S[i-1];
			}
		}
	}
	
	public void print_answer() {
		for(int i=1; i<S.length; i++) {
			if((S[i]-S[i-1]) == distance) { //최단거리 경우 출력
				System.out.println("("+S[i-1]+", "+S[i]+")");
			}
		}
	}
	public static void main(String args[]) {
		min_Distance md = new min_Distance();
		md.check_distance();
		md.print_answer();
	}
}
