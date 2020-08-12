package Lv_2;
/*
작성일 : 2020-08-12

문제 : bubble sort
출저 : http://www.codeabbey.com/index/task_view/bubble-sort
배열을 소팅하는 것은 초보 프로그래머에게 유명한 문제이며 전문적인 프로그래밍(데이터베이스, 라이브러리등)에서도 매우 중요하게 다루어 진다.
소팅은 비교에 기반을 두어 배열을 재 정렬하는 방법이다. 다음의 배열을 생각해 보자.
a = [3, 1, 4, 1, 5, 9, 2, 6]
우리는 이 배열을 크기 순서대로 정렬하고 싶다. (좌측의 요소는 우측의 요소보다 작거나 같아야 한다.)
수학적으로 표현하자면 다음과 같다.
i < j, a[i] <= a[j]
인덱스 i가 j보다 작은 경우 배열의 값인 a[i]는 a[j]값보다 작거나 같아야 한다.
버블소트(Bubble Sort)는 이러한 소팅을 하기 위한 가장 간단한 방법 중 하나이다. 그 간단한 방법은 다음과 같다:
배열을 따라가며 인접한 쌍을 찾는다. (N개의 배열이 있을 경우 N-1개의 쌍이 존재하게 된다)
만약 a[i] <= a[i+1] 을 만족하지 않는 쌍을 찾게 되면 두 개의 값을 서로 바꾸어준다. (Swap)
더 이상 바꾸어야 할 쌍이 존재하지 않을 때까지 1번, 2번을 반복한다. (Loop)
i와 j라는 인덱스를 가진 두 개의 값을 서로 바꾸기(Swap) 위해서는 몇가지 방법이 있는데 임시 변수를 사용하는 예는 다음과 같다:
t = a[i]
a[i] = a[j]
a[j] = t
입력과 출력
입력 데이터의 첫번째 라인은 배열의 갯수를 의미하며 두번째 라인은 배열의 요소값을 의미한다.
출력 데이터는 두개의 값으로 이루어진다.
첫번째 값은 배열을 따라 진행(Loop)한 횟수이며 두번째 값은 Swap이 발생한 총 횟수이다.
다음은 입출력 예제이다:
input data:
8
3 1 4 1 5 9 2 6
answer:
5 8

링크 : http://codingdojang.com/scode/448?answer_mode=hide
*/
import java.util.Scanner; 

public class bubble_Sort {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array;
		int temp,loop_time=0, swap = 0;
		//temp = 임시저장소
		//loop_time = loop 실행 횟수
		//swap = swap 실행 횟수
		System.out.println("input data : ");
		int size = sc.nextInt();
		array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		boolean loop_end; //loop를 끝낼지 결정

		while(true) {
			loop_end = true; //루프를 끝낸다고 선언
			loop_time++;
			//System.out.println("loop " + loop_time + " 회"); //루프 횟수 확인
			
			for(int i=0; i<(size-1); i++) {
				if(array[i]>array[i+1]) { //배열 값이 정렬되어있지 않을 경우
					loop_end=false; //루프를 끝내지 않는다고 선언
					swap++;
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					//System.out.print("swap " + swap + " 회 발생 : "); //swap 횟수 확인
					/*
					for(int k=0; k<size; k++) {							
						System.out.print(array[k] + " "); //swap이 일어날 경우 정렬을 하고 나서 값을 출력
					}
					System.out.println();
					*/
				}
			}
			
			if(loop_end) break; //정렬이 완료될 경우 탈출
		}
		
		System.out.println("\nanswer : \n" + loop_time +" " + swap);
	}
}
