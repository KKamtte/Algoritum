package Lv_2;
/*
�ۼ��� : 2020-08-11

���� : Josephus Problem
��ó : http://www.codeabbey.com/index/task_view/josephus-problem

�� 2,000�� ������ ���￡�� ������� ���鿡 ���� ������ ������ �Ǵ� ��찡 ���� �־��ٰ� �Ѵ�.
�׵��� ���ΰ� �Ǵ°��� �����ϱ� ���� ���׶��� ���� ������ �� ����� ���� �� ���� ������� ���ư��� ����°�� �ش�Ǵ� ����� �׿� �����ٰ� �Ѵ�.
���������� ���ԵǴ� ����� �ڻ��ϱ�� ��ӵǾ� �־����� ���� ���鿡�� �׺��� �ϴ� ��찡 ���Ҵٰ� �Ѵ�.
�������� Ǯ��� �� ������ �� �ο���(N)�� ����(K)�� �־����� �� ���� �������� ��Ƴ��� ������ ��ġ(the safe position)�� �˾Ƴ��� ���̴�.
���� ��� ������� �� 10���̰� ���ư��� ����°�� �ش�Ǵ� ���縦 �����ϴ� ���� ������ ����:
N = 10, K = 3
���� ��� ������ ���� ������ ������� ���ŵȴ�. (��ȣ�� ���ŵǴ� ���縦 �ǹ��Ѵ�)
1st round: 1 2 (3) 4 5 (6) 7 8 (9) 10
2nd round:                            1 (2) 4 5 (7) 8 10
3rd round:                                                (1) 4 5 (8) 10
4th round:                                                               4 (5) 10
5th round:                                                                        4 (10)
�� ������ ������ ��Ƴ��� ����� 4, �� 4��° �����̴�.
�Է� �����ʹ� �� ����� N�� ���� K�̴�.
��� �����ʹ� ���������� ��Ƴ��� ������ ��ġ�̴�.
(��, ���� ������ 1�� ��������̴�.)
����� ���� ������ ����:
initial data:
10 3
answer:
4

��ũ : http://codingdojang.com/scode/447?answer_mode=hide
*/
import java.util.Scanner;

public class josephusProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("initial data:");
        int solider_num =sc.nextInt(), term = sc.nextInt();
        int[] solider = new int[solider_num];
        int alive = solider_num, pointer=0, cycle=1; 
        //alive = ������ ��(while�� Ż�⿡ �̿�)
        //pointer = �迭���� ���� ������ ����Ű�� ������
        //cycle = ���ݿ� �´� cycle�� ���� �� ��� pointer�� ����Ű�� ������ ����
        for(int i=0; i<solider_num; i++) solider[i] = i+1;
        
        while(true) {
        	if(alive==1) break;
        	if(cycle==term) { //cycle�� ���� term�� �������� ���
        			solider[pointer] = -1; //������ ����(-1�� ǥ��)
        			alive--; //������ �� ����
        			cycle = 0; //cycle�� 0���� �ʱ�ȭ
        	}
        	pointer++;
        	cycle++;
        	if(pointer==(solider_num)) pointer = 0; //�迭�� ���� 10�� ����Ű�� 0���� �ٲ���
        	while(solider[pointer] == -1) pointer ++; //���� ����� �Ѿ
        }
        
        System.out.println();
        System.out.println("answer : ");
        System.out.println(solider[pointer]);
    }
}