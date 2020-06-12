
public class DirectedGraph {

	private Node[] list; 			//인접리스트
	private int numberOfVertices;	//정점수
	
	//리스트의 노드 구조를 정의한 클래스
	private class Node {
		int vertex;
		Node link;
		
		Node(int vertex) {
			this.vertex = vertex;
			this.link = null;
		}
	}
	
	//정점 수가 n인 그래프를 생성
	public DirectedGraph(int n) {
		list = new Node[n];
		numberOfVertices = n;
	}
	
	//간선 <v1, v2>를 삽입
	public void addEdge(int v1, int v2) {
		if(v1 >= numberOfVertices || v2 >= numberOfVertices) {
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호 입니다. <" + v1 + "," + v2 + ">");
		}
		else {
			Node newNode = new Node(v2);
			newNode.link = list[v1];
			list[v1] = newNode;
		}
	}
	
	//구현을 확인하기 위해 인접 리스트를 모두 출력
	public void printAdjacencyList() {
		for(int i=0; i<numberOfVertices; i++) {
			System.out.print("\n정점 " + i + "에 인접한 정점 = ");
			while(list[i] != null) {
				System.out.print(list[i].vertex + " ");
				list[i] = list[i].link;
			}
		}
	}
}
