
public class MyHashtable {
	private int hashtable[]; //���� �迭(���̺�)
	private int size; //���̺� ũ��
	private static final int EMPTY = -1; //����ִ°�
	private static final int DELETED = -2;//������ �ڸ����� ��Ÿ���� ��
	public MyHashtable(int size) {
		this.size = size;
		this.hashtable = new int[size];
		for(int i=0; i<size; i++) {
			hashtable[i] = EMPTY;
		}
	}
	public int[] gethashtable() {
		return hashtable;
	}
	
	//�й��� �Ű������� �޾� ���̺� �й��� ����. �̹� �ִ� �й��̸� ���� ����
	public boolean put(int n) {
		int current = n % size;
		while(hashtable[current]!=EMPTY) { //���� �����Ͱ� ������� �������
			if(hashtable[current]==EMPTY) { //���� �� �����Ͱ� ����������
				hashtable[current] = n;
				return true;
			}
			else if(hashtable[current]==DELETED) { //���� �� �����Ͱ� �����Ǿ��������
				hashtable[current] = n;
				return true;
			}
			else if(hashtable[current]==n) { //�ߺ��� �߰�
				return false;
			}
			else if(current>size) {
				current = 0;
			}
			else { //����������
				current++;
			}
		}
		hashtable[current] = n; //���������� �� ����
		return true;
	}
	
	//�й��� �Ű������� �޾� �˻�
	public boolean contain(int n) {
		int current = n % size;
		while(hashtable[current]!=EMPTY) { //���� �����Ͱ� ������� �������
			if(hashtable[current]==EMPTY) { //���� �� �����Ͱ� ����������
				return false;
			}
			else if(hashtable[current]==DELETED) { //���� �� �����Ͱ� �����Ǿ��������
				current++;
			}
			else if(hashtable[current]==n) { //�ߺ��� �߰�
				return true;
			}
			else { //����������
				current++;
			}
		}
		return false;
	}
	
	//�й��� �Ű������� �޾� �� �й� ������ ����. �������� �ʴ� �й��̸� ���� ����
	public boolean remove(int n) {
		int current = n % size;
		while(hashtable[current]!=EMPTY) { //���� �����Ͱ� ������� �������
			if(current==EMPTY) { //���� �� �����Ͱ� ����������
				return false;
			}
			else if(hashtable[current]==DELETED) { //���� �� �����Ͱ� �����Ǿ��������
				current++;
			}
			else if(hashtable[current]==n) { //�ߺ��� �߰�
				hashtable[current] = DELETED;
				return true;
			}
			else { //����������
				current++;
			}
		}
		return false;	
	}
	
	//�ؽ����̺� ������ ����� �Ǿ����� Ȯ���ϱ� ���� �ؽ����̺��� ��� �ε����� ������ ���
	public void print() {
		for(int i=0; i<size; i++) {
			if(hashtable[i] == EMPTY) {
				System.out.println("["+i+"] ");
			}
			else if(hashtable[i] == DELETED) {
				System.out.println("["+i+"] DELETED");
			}
			else
				System.out.println("["+i+"] " + hashtable[i]);
		}
	}
}
