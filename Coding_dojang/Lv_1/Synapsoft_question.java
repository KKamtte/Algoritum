package Lv_1;
/*
�ۼ��� : 2020-07-30

���� : ���̳�����Ʈ ��������
�־��� ���ڿ�(���� ���� ��ǥ�� ���еǾ� ����)�� ������ �Ʒ� ������ ���� ���α׷��� �ۼ��ϼ���.
[������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������]
1. �达�� �̾��� ���� �� �� �ΰ���?
2. "���翵"�̶� �̸��� �� �� �ݺ��ǳ���?
3. �ߺ��� ������ �̸��� ����ϼ���.
4. �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���.

��ũ : http://codingdojang.com/scode/410?answer_mode=hide
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
			if("��".equals(list.get(i).substring(0,1))) {
				kim++;
			} else if("���翵".equals(list.get(i))) {
				leejaeyong++;
				lee++;
			} else if("��".equals(list.get(i).substring(0,1))) {
				lee++;
			}
		}
	}
	public void remove() {
		for(int i=0; i<list.size()-1; i++) {
			for(int j=(i+1); j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					//System.out.println(i+"��°�� "+list.get(i) + " ��" + j+"��°�� "+list.get(j)+" �� �ߺ��Ǿ� ������");
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
		//System.out.println("�Է� : ");
		String str = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";
		//������, ���翵, ����ǥ, �ڹ�ȣ, ������, ������, �ֽ���, �̼���, �ڿ���, ������, ����ȯ, ���缺
		sq.list(str);
		sq.check_name();
		System.out.println("���� '��' �� ����� �� : " +sq.kim);
		System.out.println("���� '��' �� ����� �� : " +sq.lee);
		System.out.println("���翵�� �� : " + sq.leejaeyong);
		sq.remove();
		System.out.println("�ߺ��� ������ �̸� ��� ");
		System.out.println(sq.list);
		sq.change();
		System.out.println("������������ ���� �� ���");
		System.out.println(sq.list);
	}
}
