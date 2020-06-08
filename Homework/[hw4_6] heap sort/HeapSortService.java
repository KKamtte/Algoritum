
public class HeapSortService {
	
	
	public static void heap(Figure[] figure, int number) {
		Figure[] figure_temp = new Figure[1]; //�ӽ� �����
		for(int i=1; i<number; i++) {
			int child = i;
			while(child > 0) {
				int parent = (child-1) / 2;
				if(figure[child].getArea() > figure[parent].getArea()) { //�ڽ� ��尡 Ŭ��� ��ȯ
					figure_temp[0] = figure[parent];
					figure[parent] = figure[child];
					figure[child] = figure_temp[0];
				}
				child = parent;
			}
		}
	}
	public static void heap(Figure[] figure) {
		Figure[] figure_temp = new Figure[1]; //�ӽ� �����
		for(int i=figure.length-1; i>0; i--) { //�������� ����
			figure_temp[0] = figure[0];
			figure[0] = figure[i];
			figure[i] = figure_temp[0];
			
			heap(figure, i);
		}
	}
}
