
public class MyHashtable {
	private int hashtable[]; //정수 배열(테이블)
	private int size; //테이블 크기
	private static final int EMPTY = -1; //비어있는값
	private static final int DELETED = -2;//삭제된 자리임을 나타내는 값
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
	
	//학번을 매개변수로 받아 테이블에 학번을 삽입. 이미 있는 학번이면 삽입 실패
	public boolean put(int n) {
		int current = n % size;
		while(hashtable[current]!=EMPTY) { //현재 포인터가 비어있지 않을경우
			if(hashtable[current]==EMPTY) { //증가 후 포인터가 비어있을경우
				hashtable[current] = n;
				return true;
			}
			else if(hashtable[current]==DELETED) { //증가 후 포인터가 삭제되어있을경우
				hashtable[current] = n;
				return true;
			}
			else if(hashtable[current]==n) { //중복값 발견
				return false;
			}
			else if(current>size) {
				current = 0;
			}
			else { //포인터증가
				current++;
			}
		}
		hashtable[current] = n; //비어있을경우 값 삽입
		return true;
	}
	
	//학번을 매개변수로 받아 검색
	public boolean contain(int n) {
		int current = n % size;
		while(hashtable[current]!=EMPTY) { //현재 포인터가 비어있지 않을경우
			if(hashtable[current]==EMPTY) { //증가 후 포인터가 비어있을경우
				return false;
			}
			else if(hashtable[current]==DELETED) { //증가 후 포인터가 삭제되어있을경우
				current++;
			}
			else if(hashtable[current]==n) { //중복값 발견
				return true;
			}
			else { //포인터증가
				current++;
			}
		}
		return false;
	}
	
	//학번을 매개변수로 받아 그 학번 정보를 삭제. 존재하지 않는 학번이면 삭제 실패
	public boolean remove(int n) {
		int current = n % size;
		while(hashtable[current]!=EMPTY) { //현재 포인터가 비어있지 않을경우
			if(current==EMPTY) { //증가 후 포인터가 비어있을경우
				return false;
			}
			else if(hashtable[current]==DELETED) { //증가 후 포인터가 삭제되어있을경우
				current++;
			}
			else if(hashtable[current]==n) { //중복값 발견
				hashtable[current] = DELETED;
				return true;
			}
			else { //포인터증가
				current++;
			}
		}
		return false;	
	}
	
	//해시테이블 구현이 제대로 되었나를 확인하기 위해 해시테이블의 모든 인덱스와 내용을 출력
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
