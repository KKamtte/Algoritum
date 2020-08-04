package Lv_1;
/*
�ۼ��� : 2020-08-04

���� : Special Pythagorean triplet
�� �ڿ��� a, b, c �� ��Ÿ��� ���� a^2 + b^2 = c^2 �� �����ϸ� ��Ÿ��� ����� �θ��ϴ� (���⼭ a < b < c ). 
���� ��� 3^2 + 4^2 = 9 + 16 = 25 = 5^2 �̹Ƿ� 3, 4, 5�� ��Ÿ��� ���Դϴ�.
a + b + c = 1000 �� ��Ÿ��� �� a, b, c�� �� ���� ���Դϴ�. �� ��, a �� b �� c �� ���Դϱ�?
��ũ : http://codingdojang.com/scode/545?answer_mode=hide
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
