package Lv_2;
/*
작성일 : 2020-08-14

문제 : 모스부호 해독
문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
예를 들어 다음 모스부호는 "he sleeps early"로 해석해야 한다.
.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--

링크 : http://codingdojang.com/scode/469?answer_mode=hide
*/
import java.util.Scanner;

public class morseCode {
	
	public String code(String morse) {
		if(morse.equals(".-"))
			return "a";
		else if(morse.equals("-..."))
			return "b";
		else if(morse.equals("-.-."))
			return "c";
		else if(morse.equals("-.."))
			return "d";
		else if(morse.equals("."))
			return "e";
		else if(morse.equals("..-."))
			return "f";
		else if(morse.equals("--."))
			return "g";
		else if(morse.equals("...."))
			return "h";
		else if(morse.equals(".."))
			return "i";
		else if(morse.equals(".---"))
			return "j";
		else if(morse.equals("-.-"))
			return "k";
		else if(morse.equals(".-.."))
			return "l";
		else if(morse.equals("--"))
			return "m";
		else if(morse.equals("-."))
			return "n";
		else if(morse.equals("---"))
			return "o";
		else if(morse.equals(".--."))
			return "p";
		else if(morse.equals("--.-"))
			return "q";
		else if(morse.equals(".-."))
			return "r";
		else if(morse.equals("..."))
			return "s";
		else if(morse.equals("-"))
			return "t";
		else if(morse.equals("..-"))
			return "u";
		else if(morse.equals("...-"))
			return "v";
		else if(morse.equals(".--"))
			return "w";
		else if(morse.equals("-..-"))
			return "x";
		else if(morse.equals("-.--"))
			return "y";
		else if(morse.equals("--.."))
			return "z";
		else return " ";
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int start=0,end; //초기 문자열 시작은 0, 끝은 설정하지않음
		String answer="";
		
		System.out.println("모르스 부호 입력 : ");
		String code = sc.nextLine();
		//.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.-- => he sleep early
		//.- -... -.-. -.. . ..-. --.  .... .. .--- -.-  .-.. -- -. --- .--.  --.- .-. ...  - ..- ...-  .-- -..-  -.-- --.. => a~z
		morseCode mc = new morseCode();
		
		for(int i=0; i<code.length(); i++) { //문자열 처음부터 끝까지 검사
			if(code.substring(i, i+1).equals(" ")) { //중간에 공백발견시
				end = i; //끝 문자열 선택
				answer += mc.code(code.substring(start, end)); //글자를 분할 저장
				start = i+1; //끝문자열 다음 문자열을 시작 문자열로 선택
			}
		}
		answer += mc.code(code.substring(start)); //마지막 문자열 분할 저장
		System.out.println(answer);
	}
}
