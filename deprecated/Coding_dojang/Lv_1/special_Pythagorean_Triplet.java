package Lv_1;
/*
작성일 : 2020-08-04

문제 : Special Pythagorean triplet
세 자연수 a, b, c 가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ). 
예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2 이므로 3, 4, 5는 피타고라스 수입니다.
a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
링크 : http://codingdojang.com/scode/545?answer_mode=hide
*/
public class special_Pythagorean_Triplet {
	int ans;
	
	public void check() {
		for(int i=1; i<1000; i++) {
			for(int j=(i+1); j<1000; j++) {
				if(i+j+Math.sqrt(i*i+j*j) == 1000 ) {
					System.out.println("a:" +i +" " +"b:" +j +" " +"c:" + (int)Math.sqrt(i*i + j*j));
					System.out.println("a x b x c = "+i * j * (int)Math.sqrt(i*i + j*j));
				}
			}
		}
	}
	
	public static void main(String args[]) {
		special_Pythagorean_Triplet spt = new special_Pythagorean_Triplet();
		spt.check();
	}
}
