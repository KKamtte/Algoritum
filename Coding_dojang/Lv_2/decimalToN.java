package Lv_2;
/*
�ۼ��� : 2020-08-13

���� : 10������ n������ ��ȯ�ϱ�
������ 233 �̶� 10������ 2������ ��ȯ�ϴ� ������ ��Ÿ�� �׸��̴�.

�� �׸��� �����Ͽ� ���̺귯���� ������� ���� 10������ n������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.. (��, n�� ������ 2 <= n <= 16)
��)
2������ ��ȯ : 23310 --> 111010012
8������ ��ȯ : 23310 --> 3518
16������ ��ȯ : 23310 --> E916

��ũ : http://codingdojang.com/scode/458?answer_mode=hide
*/
public class decimalToN {
	//2���� ��ȯ
	public String binaryNumer(int num) {
		String bin = "";
		while(true) {
			if(num<2) { //���̻� �������� ���
				bin += String.valueOf(num);
				break;
			}
			bin += String.valueOf(num%2); //�������� �߰�
			num = num/2; //2�� ������ ����
		}
		return (new StringBuffer(bin)).reverse().toString(); //����� ����
	}
	//8���� ��ȯ
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
	//16���� ��ȯ
	public String hexNumer(int num) {
		String hex = "";
		while(true) {
			if(num<16) { //�� 10�� �ڸ� �� ���� ���ĺ����� ġȯ
				if(num%16==15) hex += "F";
				else if(num%16==14) hex += "E";
				else if(num%16==13) hex += "D";
				else if(num%16==12) hex += "C";
				else if(num%16==11) hex += "B";
				else if(num%16==10) hex += "A";
				else hex += String.valueOf(num);
				break;
			}
			//�� 10�� �ڸ� �� ���� ���ĺ����� ġȯ
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
		System.out.println("2������ ��ȯ : " + i + " ---> " + binNum);
		System.out.println("8������ ��ȯ : " + i + " ---> " + octNum);
		System.out.println("16������ ��ȯ : " + i + " ---> " + hexNum);
	}
}
