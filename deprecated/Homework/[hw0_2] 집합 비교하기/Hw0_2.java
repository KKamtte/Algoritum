/*
두 개의 양의 정수 집합(예를 들어 학번)이 동일한지 알아보는 자바 프로그램을 작성하시오.
문제 설명:
양의 정수 집합을 두 개 입력 받아 각각 크기가 100인 배열에 저장해 둔다.
이 때, -1과 같이 양의 정수가 아닌 값을 입력하면 각 집합 입력을 마친 것으로 본다.
각 집합의 원소 개수는 최대 100으로 본다.
집합이므로 원소의 순서는 중요하지 않다.
사용자가 집합을 잘 입력한다고 가정한다. 즉, 사용자가  동일한 원소를 중복하여 입력하는 일은 없다고 본다.
?두 집합이 동일한지 여부를 검사한다.
입력: 첫번째 집합, 두번째 집합
출력: 두 집합이 동일한지 여부
 
목적
알고리즘 공부에 앞서 자바 프로그래밍과 자료구조를 복습한다.
 
실행 예 1:
hw0_2 : 홍길동

양의 정수 집합을 비교하는 프로그램입니다.
첫번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 :  111  3  2  5  -1 
두번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 :  3  2  5  111  -1 
두 집합은 같습니다.

유의 사항
각 집합에 대해 크기가 100인 기본적인 정수형 배열을 이용하여 최대 100개의 값을 저장할 수 있도록 하세요.
조건문, 반복문등을 이용하여 하나 하나 값을 찾아보도록 프로그램을 작성하세요.
즉, ArrayList등자바가 제공하는 고급 자료 구조 기능을 이용하지 마세요.
각 집합의 원소 개수가 100 이상 입력하는 경우의 처리는 각자 알아서 할 것. 무시해도 되고, 적절히 처리해도 됨
*/

import java.util.Scanner;

public class Hw0_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hw0_2 : 김승현");
		System.out.println("양의 정수 집합을 비교하는 프로그램입니다.");
		System.out.println("");
		
		int i = 0;
		int j = 0;
		int[] array1 = new int[100];
		int[] array2 = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		//첫번째 집합 입력받음
		System.out.print("첫번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		for(i=0; i<100; i++) {
			int i1 = sc.nextInt();
			if(i1 > 0) {
				array1[i] = i1;
				//System.out.print("array1["+i+"] = "+array1[i]);
				//System.out.println("");
			}
			else {
				break;
			}
		}
		
		/* array1 입력값
		for(int i1=0; i1<i; i1++) {
			System.out.print(array1[i1]+" ");
		}
		
		System.out.println("입력완료"+i);
		*/
		
		//첫번째 집합 크기순 정렬
		for(int i1=0; i1<i-1; i1++) {
			for(int i2=i1+1; i2<i; i2++) {
				if(array1[i1] > array1[i2]) {
					int x = array1[i2];
					array1[i2] = array1[i1];
					array1[i1] = x;
				}
			}
		}
		
		/* array1 정렬값
		for(int i1=0; i1<i; i1++) {
			System.out.print(array1[i1]+" ");
		}
		System.out.println("정렬완료");
		*/
		
		//두번째 집합 입력받음
		System.out.print("두번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		for(j=0; j<100; j++) {
			int j1 = sc.nextInt();
			if(j1 > 0) {
				array2[j] = j1;
				//System.out.print("array2["+j+"] = "+array2[j]);
				//System.out.println("");
			}
			else {
				break;
			}
		}
		
		/* array2 입력값
		for(int j1=0; j1<i; j1++) {
			System.out.print(array2[j1]+" ");
		}
		
		System.out.println("입력완료"+j);
		*/
		
		//두번째 집합 크기순 정렬
		for(int j1=0; j1<j-1; j1++) {
			for(int j2=j1+1; j2<j; j2++) {
				if(array2[j1] > array2[j2]) {
					int x = array2[j2];
					array2[j2] = array2[j1];
					array2[j1] = x;
				}
			}
		}
		
		/* array2 정렬값
		for(int j1=0; j1<j; j1++) {
			System.out.print(array2[j1]+" ");
		}
		System.out.println("정렬완료");
		*/
		
		//집합비교
		if(i == j) {
			//System.out.println("크기같음");
			for(i=0; i<j; i++) {
				if(array1[i] != array2[i]) {
					//System.out.println("array1["+i+"] = "+array1[i]+" && "+"array2["+i+"] = "+array2[i]);
					System.out.println("두 집합은 다릅니다.");
					break;
				}else if(array1[i] == array2[j-1]) {
					System.out.println("두 집합은 같습니다.");
				}
			}
		}
		else {
			System.out.println("두 집합은 다릅니다.");
		}
		//System.out.println("크기비교 완료");
	}
	
}
