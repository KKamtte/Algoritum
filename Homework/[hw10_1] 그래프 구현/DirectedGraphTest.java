//���ϸ� : DirectedGraphTest.java
//�ۼ��� : �����
//�ۼ��� : 2020-06-12
//���� : [hw10_1] �׷��� ����

import java.util.Scanner;

public class DirectedGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw10_1 : �����");
		
		Scanner sc = new Scanner(System.in);
		
		//���� �� n�� �Է� �ް�  ����׷��� ����
		System.out.print("\n���� �� �Է� :");
		int n = sc.nextInt();
		DirectedGraph graph = new DirectedGraph(n);
		
		//���� �� e�� �Է¹ް� �׷��a�� ����
		System.out.print("���� �� �Է� :");
		int e = sc.nextInt();
		System.out.print("\n" + e +"���� ���� �Է�(�� ������ ���� ��ȣ 2�Ը� whitespace�� �����Ͽ� �Է�):\n");
		for(int i=0; i<e; i++) {
			System.out.print("����" + (i+1) + "�Է� :");
			graph.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		//�׷��� ������ Ȯ��
		graph.printAdjacencyList();
	}

}
