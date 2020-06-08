
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
	
	//배열 입력 받음
	public void matrix(int i,int j,int n) {
		DP[i][j] = n;
	}
	
	//최대 점수 출력
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
	
	//행렬 경로 알고리즘
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
	
	//최대 점수 경로 출력
	public void printDProad() {
		int i=1, j=1;
		while(true) {
			
			
			
			//i와 j 둘다 size까지 도달하지 않은경우
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
			//i와 j 둘다 size까지 도달한경우
			else if(i==size && j==size) {
				System.out.print("(" + i + ", " + j +")");
				break;
			}
			//i가 size까지 도달한경우
			else if(i == size) {
				System.out.print("(" + i + ", " + j +")");
				j++;
			}
			//j가 size까지 도달한경우
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
