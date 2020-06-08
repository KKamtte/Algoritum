
public class FigureSortService {
	public static void mergeSort(Figure[] figure) {
		mergeSort(figure, 0, figure.length);
	}
	
	public static void mergeSort(Figure[] figure, int low, int high) {
		//�迭 ������ �ϳ��� �� ����
		if(high - low < 2) {
			return;
		}
		
		int mid = (low + high) / 2; //�迭 ������ �ɰ�
		mergeSort(figure, 0, mid); //�迭 �պκ�
		mergeSort(figure, mid, high); //�迭 �޺κ�
		merge(figure, low, high); //����
	}
	
	public static void merge(Figure[] figure, int low, int high) {
		int t = 0, l = low, h = (low + high) / 2;
		Figure temp[] = new Figure[high]; //�ӽ� ����� ���
		
		while(l < (low + high) / 2 && h < high) { //�迭 ���
			if(figure[l].getArea() < figure[h].getArea()) {
				temp[t++] = figure[l++]; //�޹迭�� Ŭ��� �չ迭 ���� �� ����
			} else {
				temp[t++] = figure[h++]; //�ݴ��۾�
			}
		}
		
		//�� ���ǹ��� �ش����� �ʴ� �迭�� Ȯ�� �� ����
		while(l < (low + high) / 2) {
			temp[t++] = figure[l++];
		}
		
		while(h < high) {
			temp[t++] = figure[h++];
		}
		
		//�迭 ���� �ӽ� ����ҿ��� ������ ������
		for(int i=low; i<high; i++) {
			figure[i] = temp[i - low];
		}
	}
}
