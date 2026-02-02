package Lv_2;
/*
작성일 : 2020-08-10

문제 : Ones 
출처: programming challenges
2나 5로 나눌 수 없는 0 이상 10,000 이하의 정수 n이 주어졌는데, n의 배수 중에는 10진수로 표기했을 때 모든 자리 숫자가 1인 것이 있다.
그러한 n의 배수 중에서 가장 작은 것은 몇 자리 수일까?
<Sample Input>
3
7
9901
<Sample Output>
3
6
12
*/
import java.util.Scanner;

public class ones {
	String div = "1";
	long div_num;
	
	public void div(int k) {
		div_num = Long.parseLong(div); //string타입으로 정의한 div를 long타입으로 변환 
		if((div_num/k * k) == div_num) { //나누고 나서 다시 곱하였을 경우 같은 숫자가 나오는 지 검사
			System.out.println(div.length());
			} 
		else {
			this.div = div + "1"; //1->11, 11->111같이 1씩 붙여서 증가 하도록 함
			div(k);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ones ones = new ones();
		while(true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			if((num/2 * 2) == num || (num/5 * 5) == num) {
				System.out.println("2나 5로 나눠짐");
			} else {
				ones.div(num);
				break;
			}
		}
	}
}
