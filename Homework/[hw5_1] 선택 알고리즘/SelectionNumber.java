//파일명 : SelectionNumber
//작성자 : 김승현
//작성일 : 2020-04-24
//내용 : [hw5_1] 선택 알고리즘

import java.util.Scanner;

public class SelectionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("hw5_1 : 김승현");
		System.out.print("\n정수갯수 입력 : ");
		int n = sc.nextInt(); //정수 갯수 받음
		
		//배열생성 및 정수 입력받음
		int[] num = new int[n];
		
		System.out.print(n + "개의 정수 입력 : ");
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		//선택정렬 수행
		for(int i=0; i<num.length-1; i++) {
			int x = num[i]; //초기 최소값 설정
			int swap=i;
			//최소값 선택 알고리즘 수행
			for(int j=i+1; j<num.length; j++) {
				if(x > num[j]) {
					x = num[j];
					swap = j;
				}
			}
			//swap 수행
			//System.out.println("\n\n작업수행 = ["+i+"]값 "+num[i]+" 그리고 ["+swap+"]값 "+num[swap]+"이 변경됨");
			num[swap] = num[i];
			num[i] = x;
			/*
			for(int k=0; k<num.length; k++) {
				System.out.print(num[k]+" ");
			}
			*/
		}
		//중앙값 출력
		System.out.println("중앙값 = " + num[(n-1)/2]);
	}

}
