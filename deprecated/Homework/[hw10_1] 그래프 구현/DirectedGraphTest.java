//파일명 : DirectedGraphTest.java
//작성자 : 김승현
//작성일 : 2020-06-12
//내용 : [hw10_1] 그래프 구현

import java.util.Scanner;

public class DirectedGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw10_1 : 김승현");
		
		Scanner sc = new Scanner(System.in);
		
		//정점 수 n을 입력 받고  방향그래프 생성
		System.out.print("\n정점 수 입력 :");
		int n = sc.nextInt();
		DirectedGraph graph = new DirectedGraph(n);
		
		//간선 수 e를 입력받고 그래픞에 삽입
		System.out.print("간선 수 입력 :");
		int e = sc.nextInt();
		System.out.print("\n" + e +"개의 간선 입력(각 간선은 정점 번호 2게를 whitespace로 구분하여 입력):\n");
		for(int i=0; i<e; i++) {
			System.out.print("간선" + (i+1) + "입력 :");
			graph.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		//그래프 구현을 확인
		graph.printAdjacencyList();
	}

}
