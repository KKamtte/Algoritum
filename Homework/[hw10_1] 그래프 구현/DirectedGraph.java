
public class DirectedGraph {

	private Node[] list; 			//��������Ʈ
	private int numberOfVertices;	//������
	
	//����Ʈ�� ��� ������ ������ Ŭ����
	private class Node {
		int vertex;
		Node link;
		
		Node(int vertex) {
			this.vertex = vertex;
			this.link = null;
		}
	}
	
	//���� ���� n�� �׷����� ����
	public DirectedGraph(int n) {
		list = new Node[n];
		numberOfVertices = n;
	}
	
	//���� <v1, v2>�� ����
	public void addEdge(int v1, int v2) {
		if(v1 >= numberOfVertices || v2 >= numberOfVertices) {
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ �Դϴ�. <" + v1 + "," + v2 + ">");
		}
		else {
			Node newNode = new Node(v2);
			newNode.link = list[v1];
			list[v1] = newNode;
		}
	}
	
	//������ Ȯ���ϱ� ���� ���� ����Ʈ�� ��� ���
	public void printAdjacencyList() {
		for(int i=0; i<numberOfVertices; i++) {
			System.out.print("\n���� " + i + "�� ������ ���� = ");
			while(list[i] != null) {
				System.out.print(list[i].vertex + " ");
				list[i] = list[i].link;
			}
		}
	}
}
