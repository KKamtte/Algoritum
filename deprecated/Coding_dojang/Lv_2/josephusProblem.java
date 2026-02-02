package Lv_2;
/*
작성일 : 2020-08-11

문제 : Josephus Problem
출처 : http://www.codeabbey.com/index/task_view/josephus-problem

약 2,000년 전에는 전쟁에서 병사들이 적들에 의해 동굴에 갇히게 되는 경우가 종종 있었다고 한다.
그들은 포로가 되는것을 방지하기 위해 동그랗게 서서 마지막 한 사람이 남을 때 까지 순서대로 돌아가며 세번째에 해당되는 사람을 죽여 나갔다고 한다.
마지막으로 남게되는 사람은 자살하기로 약속되어 있었지만 보통 적들에게 항복을 하는 경우가 많았다고 한다.
여러분이 풀어야 할 문제는 총 인원수(N)와 간격(K)이 주어졌을 때 가장 마지막에 살아남는 병사의 위치(the safe position)를 알아내는 것이다.
예를 들어 병사수가 총 10명이고 돌아가며 세번째에 해당되는 병사를 제거하는 경우는 다음과 같다:
N = 10, K = 3
위의 경우 다음과 같은 순서로 병사들이 제거된다. (괄호는 제거되는 병사를 의미한다)
1st round: 1 2 (3) 4 5 (6) 7 8 (9) 10
2nd round:                            1 (2) 4 5 (7) 8 10
3rd round:                                                (1) 4 5 (8) 10
4th round:                                                               4 (5) 10
5th round:                                                                        4 (10)
위 예에서 끝가지 살아남는 병사는 4, 즉 4번째 병사이다.
입력 데이터는 총 병사수 N과 간격 K이다.
출력 데이터는 마지막까지 살아남는 병사의 위치이다.
(단, 최초 시작은 1번 병사부터이다.)
입출력 예는 다음과 같다:
initial data:
10 3
answer:
4

링크 : http://codingdojang.com/scode/447?answer_mode=hide
*/
import java.util.Scanner;

public class josephusProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("initial data:");
        int solider_num =sc.nextInt(), term = sc.nextInt();
        int[] solider = new int[solider_num];
        int alive = solider_num, pointer=0, cycle=1; 
        //alive = 생존자 수(while문 탈출에 이용)
        //pointer = 배열에서 죽일 군인을 가르키는 포인터
        //cycle = 간격에 맞는 cycle에 도달 할 경우 pointer가 가르키는 군인을 죽임
        for(int i=0; i<solider_num; i++) solider[i] = i+1;
        
        while(true) {
        	if(alive==1) break;
        	if(cycle==term) { //cycle이 죽일 term에 도달했을 경우
        			solider[pointer] = -1; //군인을 죽임(-1로 표현)
        			alive--; //생존자 수 줄임
        			cycle = 0; //cycle을 0으로 초기화
        	}
        	pointer++;
        	cycle++;
        	if(pointer==(solider_num)) pointer = 0; //배열의 값을 10을 가르키면 0으로 바꿔줌
        	while(solider[pointer] == -1) pointer ++; //죽은 사람은 넘어감
        }
        
        System.out.println();
        System.out.println("answer : ");
        System.out.println(solider[pointer]);
    }
}