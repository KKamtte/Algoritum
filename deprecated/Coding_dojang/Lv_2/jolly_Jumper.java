package Lv_2;
/*
작성일 : 2020-08-07

문제 : Jolly Jumpers
출처 : programming-challenges.com
n개의 정수(n>0)로 이루어진 수열에 대해 서로 인접해 있는 두 수의 차가 1에서 n-1까지의 값을 모두 가지면 그 수열을 유쾌한 점퍼(jolly jumper)라고 부른다. 예를 들어 다음과 같은 수열에서
1 4 2 3
앞 뒤에 있는 숫자 차의 절대 값이 각각 3,2,1이므로 이 수열은 유쾌한 점퍼가 된다. 어떤 수열이 유쾌한 점퍼인지 판단할 수 있는 프로그램을 작성하라.

<Input>
각 줄 맨 앞에는 3000 이하의 정수가 있으며 그 뒤에는 수열을 나타내는 n개의 정수가 입력된다. 맨 앞 숫자가 0이면 출력하고 종료한다.
<output>
입력된 각 줄에 대해 "Jolly" 또는 "Not Jolly"를 한 줄씩 출력한다

<Sample Input>
4 1 4 2 3
5 1 4 2 -1 6
※ 주의: 각 줄의 맨 앞의 숫자는 수열의 갯수이다. 첫번째 입력인 4 1 4 2 3 의 맨 앞의 4는 뒤에 4개의 숫자가 온다는 것을 의미함
<Sample Output>
Jolly
Not jolly
링크 : http://codingdojang.com/scode/424?answer_mode=hide
*/
import java.util.Scanner;
import java.util.ArrayList;

public class jolly_Jumper {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//arraylist에 두 수의 차를 구한 뒤 절대값을 만듬
	public void makelist(int num1, int num2) {
		int num = num2 - num1;
		if(num<0)
			list.add(-num);
		else
			list.add(num);
	}
	
	//jolly인지 확인 입력값 -1을 기준으로 1까지 줄이면서 확인
	public boolean check_jolly(int num) {
		boolean check = true;
		for(int i=(num-1); i>0; i--) {
			if(list.indexOf(i)<0) {
				return false;
			}
		}
		return check;
	}
	
	public static void main(String args[]) {
		
		int[] array = new int[3000];
		jolly_Jumper jj = new jolly_Jumper();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			array[0] = sc.nextInt();
			if(array[0]==0) {
				break;
			}
			
			for(int i=1; i<=array[0]; i++) {
				array[i] = sc.nextInt();
			}
			
			for(int i=1; i<array[0]; i++) {
				jj.makelist(array[i], array[i+1]);
			}
			if(jj.check_jolly(array[0])) {
				System.out.println("Jolly");
			} else
				System.out.println("Not jolly");
		break;}//while문 종료
	}
}
