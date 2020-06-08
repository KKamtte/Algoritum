
public class DynamicProgramming {
	private int DP[][];
	private int size;
	private int DP_result[][];
	private int result;
	
	public DynamicProgramming(int n) {
		this.size = n;
		this.DP = new int [n][n];
		this.DP_result = new int [n+1][n+1];
		this.result = 0;
	}
	
	//�迭 �Է� ����
	public void matrix(int i,int j,int n) {
		DP[i][j] = n;
	}
	
	//�ִ� ���� ���
	public void printDP() {
		/*
		for(int i=0; i<size+1; i++) {
			for(int j=0; j<size+1; j++) {
				System.out.print(DP_result[i][j] + " ");
			}
			System.out.println();
		}
		*/
		System.out.println(DP_result[size][size]);
	}
	
	//��� ��� �˰���
	public void makeDPresult() {
		for(int i=1; i<size+1; i++) {
			for(int j=1; j<size+1; j++) {
				if(DP_result[i][j-1]>DP_result[i-1][j])
					DP_result[i][j] = DP[i-1][j-1] + DP_result[i][j-1];
				else
					DP_result[i][j] = DP[i-1][j-1] + DP_result[i-1][j];	
			}
		}
	}
	
	//�ִ� ���� ��� ���
	public void printDProad() {
		int i=1, j=1;
		while(true) {
			
			
			
			//i�� j �Ѵ� size���� �������� �������
			if(i != size && j != size) {
				if(DP_result[i][j+1]>DP_result[i+1][j]) {
					System.out.print("(" + i + ", " + j +")");
					j++;
				}
				else {
					System.out.print("(" + i + ", " + j +")");
					i++;
				}
			}
			//i�� j �Ѵ� size���� �����Ѱ��
			else if(i==size && j==size) {
				System.out.print("(" + i + ", " + j +")");
				break;
			}
			//i�� size���� �����Ѱ��
			else if(i == size) {
				System.out.print("(" + i + ", " + j +")");
				j++;
			}
			//j�� size���� �����Ѱ��
			else if(j == size){
				System.out.print("(" + i + ", " + j +")");
				i++;
			}
			
			/*
			if(DP_result[i][j+1]>DP_result[i+1][j]) {
				System.out.print("(" + i + ", " + j +")");
				if(j != size) {
					j++;
				}
			}
			else {
				System.out.print("(" + i + ", " + j +")");
				if(i != size) {
					i++;
				}
			}
			if(i == size) {
				System.out.print("(" + i + ", " + j +")");
				j++;
			}
			else if(j == size){
				System.out.print("(" + i + ", " + j +")");
				i++;
			} */
		}
	} 
}
