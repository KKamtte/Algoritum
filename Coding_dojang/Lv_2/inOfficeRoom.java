package Lv_2;
/*
�ۼ��� : 2020-08-07

���� : �� �ð��� �繫�ǿ� �� ���� �־���? 
��ó: http://www.careercup.com/question?id=13817668
�Ƹ��� ��������
A�繫�ǿ��� Ư�������� ����� �ð��� ��ϵ� �Ŵ��� �α������� �ִٰ� �Ѵ�.
������ ������ ������ ����. (�� ���ο��� �պκ��� ��ٽð�(HH:MM:SS), �޺κ��� ��ٽð��̴�)
09:12:23 11:14:35
10:34:01 13:23:40
10:34:31 11:20:10
Ư���ð��� �Է�(��:11:05:20)���� �־��� �� �� �ð��� �� �� ���� �繫�ǿ� �־����� �˷��ִ� �Լ��� �ۼ��Ͻÿ�.
��ũ : http://codingdojang.com/scode/418?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;

public class inOfficeRoom {
	
	//�繫�� ����� �ð�
	String[][] array = new String[][] {
		{"09:12:23", "11:14:35"},
		{"10:34:01", "13:23:40"},
		{"10:34:31", "11:20:10"}
	};
	
	//�繫�ǿ� �־����� Ȯ���ϰ� ��� ���� ����
	public int check(String str) {
		int inpeople=0;
		for(int i=0; i<array.length; i++) {
			if(compare(array[i][0], str) && compare(str, array[i][1])) { //��� �� ��ٽð� ���̿� �ִٴ� ������ ���ÿ� �����ϴ��� �˻�
				inpeople++;
			}
		}
		return inpeople;
	}
	
	//�繫�ǿ� �־����� true������ false�� ����
	public boolean compare(String str1, String str2) {
		if(str1.compareTo(str2)<=0) { //str1(��ٽð�/�˻��ð�) : str2(�˻��ð�/��ٽð�) str1�� �۰ų� ������� �繫�ǿ� �־���
			return true;
		}else return false;
	}
	
	public static void main(String args[]) {
		
		inOfficeRoom office = new inOfficeRoom();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð� �Է�(HH:MM:SS) : ");
		String time = sc.next();
		
		System.out.println("�繫�ǿ� �־��� �ο��� �� " + office.check(time) + " �Դϴ�.");	
	}
}
