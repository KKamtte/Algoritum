//파일명 : DP_Test.java
//작성자 : 김승현
//작성일 : 2020-05-29
//내용 : [hw8_1] 행렬 경로 문제

import java.util.Scanner;

public class DP_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw8_1 : 김승현");
		System.out.println("선택과제 수행했습니다.");
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("행의 크기 입력 : ");
		n = sc.nextInt();
		DynamicProgramming dp = new DynamicProgramming(n);
		
		System.out.println("\n" + n + " x " + n + "크기의 행렬 원소 입력 :");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				dp.matrix(i,j,sc.nextInt());
			}
		}
		dp.makeDPresult();
		
		System.out.print("\n최대 점수 = ");
		dp.printDP();
		System.out.print("최대 점수 경로 = ");
		dp.printDProad();
	}

}
