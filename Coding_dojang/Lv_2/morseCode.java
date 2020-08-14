package Lv_2;
/*
�ۼ��� : 2020-08-14

���� : �𽺺�ȣ �ص�
���ڿ� �������� �Է� ���� ���ڵ�(dot: . dash:-)�� �ص��Ͽ� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
���ڿ� ���� ���̴� ���� �ϳ�, �ܾ�� �ܾ� ���̴� ���� �ΰ��� �����Ѵ�.
���� ��� ���� �𽺺�ȣ�� "he sleeps early"�� �ؼ��ؾ� �Ѵ�.
.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--

��ũ : http://codingdojang.com/scode/469?answer_mode=hide
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
		int start=0,end; //�ʱ� ���ڿ� ������ 0, ���� ������������
		String answer="";
		
		System.out.println("�𸣽� ��ȣ �Է� : ");
		String code = sc.nextLine();
		//.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.-- => he sleep early
		//.- -... -.-. -.. . ..-. --.  .... .. .--- -.-  .-.. -- -. --- .--.  --.- .-. ...  - ..- ...-  .-- -..-  -.-- --.. => a~z
		morseCode mc = new morseCode();
		
		for(int i=0; i<code.length(); i++) { //���ڿ� ó������ ������ �˻�
			if(code.substring(i, i+1).equals(" ")) { //�߰��� ����߽߰�
				end = i; //�� ���ڿ� ����
				answer += mc.code(code.substring(start, end)); //���ڸ� ���� ����
				start = i+1; //�����ڿ� ���� ���ڿ��� ���� ���ڿ��� ����
			}
		}
		answer += mc.code(code.substring(start)); //������ ���ڿ� ���� ����
		System.out.println(answer);
	}
}
