package Lv_2;
/*
작성일 : 2020-08-13

문제 : 10진수를 n진수로 변환하기
다음은 233 이란 10진수를 2진수로 변환하는 과정을 나타낸 그림이다.

위 그림을 참조하여 라이브러리를 사용하지 말고 10진수를 n진수로 변환하는 프로그램을 작성하시오.. (단, n의 범위는 2 <= n <= 16)
예)
2진수로 변환 : 23310 --> 111010012
8진수로 변환 : 23310 --> 3518
16진수로 변환 : 23310 --> E916

링크 : http://codingdojang.com/scode/458?answer_mode=hide
*/
public class decimalToN {
	//2진법 변환
	public String binaryNumer(int num) {
		String bin = "";
		while(true) {
			if(num<2) { //더이상 못나누는 경우
				bin += String.valueOf(num);
				break;
			}
			bin += String.valueOf(num%2); //나머지값 추가
			num = num/2; //2로 나눈값 저장
		}
		return (new StringBuffer(bin)).reverse().toString(); //뒤집어서 리턴
	}
	//8진법 변환
	public String octNumer(int num) {
		String oct = "";
		while(true) {
			if(num<8) {
				oct += String.valueOf(num);
				break;
			}
			oct += String.valueOf(num%8);
			num = num/8;
		}
		return (new StringBuffer(oct)).reverse().toString();
	}
	//16진법 변환
	public String hexNumer(int num) {
		String hex = "";
		while(true) {
			if(num<16) { //각 10의 자리 수 마다 알파벳으로 치환
				if(num%16==15) hex += "F";
				else if(num%16==14) hex += "E";
				else if(num%16==13) hex += "D";
				else if(num%16==12) hex += "C";
				else if(num%16==11) hex += "B";
				else if(num%16==10) hex += "A";
				else hex += String.valueOf(num);
				break;
			}
			//각 10의 자리 수 마다 알파벳으로 치환
			if(num%16==15) hex += "F";
			else if(num%16==14) hex += "E";
			else if(num%16==13) hex += "D";
			else if(num%16==12) hex += "C";
			else if(num%16==11) hex += "B";
			else if(num%16==10) hex += "A";
			else hex += String.valueOf(num%16);
			num = num/16;
		}
		return (new StringBuffer(hex)).reverse().toString();
	}
	
	public static void main(String args[]) {
		int i = 233;
		String binNum="", octNum="", hexNum="";
		decimalToN dtn = new decimalToN();
		
		binNum = dtn.binaryNumer(i);
		octNum = dtn.octNumer(i);
		hexNum = dtn.hexNumer(i);
		System.out.println("2진수로 변환 : " + i + " ---> " + binNum);
		System.out.println("8진수로 변환 : " + i + " ---> " + octNum);
		System.out.println("16진수로 변환 : " + i + " ---> " + hexNum);
	}
}
