
public class MyBinarySearchTree {
	private Node root;
	private int node;
	
	public MyBinarySearchTree() {
		this.root = null;
	}
	//트리에 저장된 아이디를 모두 출력
	public void print() {
		System.out.println("트리에 저장된 아이디의 갯수 : " + size());
		inorder(root);
		System.out.println();
	}
	//트리에 저장된 아이디 수(노드 수)를 리턴
	public int size() {
		int size;
		
		if(root == null) {
			size = 0;
		}
		else {
			size = size(root.getLeft()) + size(root.getRight()) + 1;
		}
		return size;
	}
	private int size(Node root) {
		int size;
		
		if(root == null) {
			size = 0;
		}
		else {
			size = size(root.getLeft()) + size(root.getRight()) + 1;
		}
		return size;
	}
	//트리에 아이디가 존재하는지 여부를 검사 / 리턴값 : 성공T 실패F
	public boolean contain(String id) {
		Node current = root;
		while(current!=null) {
			if(current.getid().compareTo(id)==0) {
				return true;
			}else if(current.getid().compareTo(id)>0) {
				current = current.getLeft();
			}else {
				current = current.getRight();
			}
		}
		return false;
	}
	//트리에 아이디(노드)를 삽입. 이미 존재하는 아이디면 삽입 실패 / 리턴값 : 성공T 실패 F
	public boolean add(String id) {
		if(contain(id)==true){
			return false;
		} else {
			//값 삽입 코드
			Node newNode = new Node(id);
			if(root==null) {
				root = newNode;
				return true;
			}
			Node current = root;
			Node parent = null;
			while(true) {
				parent = current;
				if(current.getid().compareTo(id)>0) {
					current = current.getLeft();
					if(current==null) {
						parent.setLeft(newNode);
						return true;
					}
				} else {
					current = current.getRight();
					if(current==null) {
						parent.setRight(newNode);
						return true;
					}
				}
			}
		}
	}
	//트리에서 아이디(노드)를 삭제. 존재하지 않는 아이디면 삭제 실패 / 리턴값 : 성공T 실패F
	public boolean remove(String id) {
		if(contain(id)==false){
			return false;
		} else {
			Node parent = root;
			Node current = root;
			boolean isLeftChild = false;
			while(current.getid().compareTo(id)!=0) {
				parent = current;
				if(current.getid().compareTo(id)>0) {
					isLeftChild = true;
					current = current.getLeft();
				} else {
					isLeftChild = false;
					current = current.getRight();
				}
			}
			//자식노드가 없는 경우
			if(current.getLeft()==null && current.getRight()==null) {
				if(current==root) {
					root = null;
				}
				if(isLeftChild==true) {
					parent.setLeft(null);
				}else {
					parent.setRight(null);
				}
			}
			//자식을 하나만 갖는 경우
			else if(current.getRight()==null) {
				if(current==root) {
					root = current.getLeft();
				}else if(isLeftChild) {
					parent.setLeft(current.getLeft());
				}else {
					parent.setRight(current.getLeft());
				}
			} else if(current.getLeft()==null) {
				if(current==root) {
					root = current.getRight();
				}else if(isLeftChild) {
					parent.setLeft(current.getRight());
				}else {
					parent.setRight(current.getRight());
				}
			}
			//자식을 두개 갖는 경우
			else if(current.getLeft()!=null && current.getRight()!=null) {
				Node successor = getSuccessor(current);
				if(current==root) {
					root =successor;
				}else if(isLeftChild) {
					parent.setLeft(successor);
				}else {
					parent.setRight(successor);
				}
				successor.setLeft(current.getLeft());
			}
			return true;
		}
	}
	public Node getSuccessor(Node deleteNode) {
		Node successor = null;
		Node successorParent = null;
		Node current = deleteNode.getRight();
		while(current!=null) {
			successorParent = successor;
			successor = current;
			current = current.getLeft();
		}
		if(successor!=deleteNode.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(deleteNode.getRight());
		}
		return successor;
	}
	//트리를 중순위 순회하며 키값을 출력
	private void inorder(Node root) { //재귀 메소드
		if(root!=null) {
			inorder(root.getLeft());
			System.out.print(root.getid() + " ");
			inorder(root.getRight());
		}
	}
	private class Node {
		private String id;
		private Node left;
		private Node right;
		
		public Node(String id) {
			this.setid(id);
			setLeft(null);
			setRight(null);
		}
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
}