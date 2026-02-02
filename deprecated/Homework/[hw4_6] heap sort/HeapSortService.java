
public class HeapSortService {
	
	
	public static void heap(Figure[] figure, int number) {
		Figure[] figure_temp = new Figure[1]; //임시 저장소
		for(int i=1; i<number; i++) {
			int child = i;
			while(child > 0) {
				int parent = (child-1) / 2;
				if(figure[child].getArea() > figure[parent].getArea()) { //자식 노드가 클경우 교환
					figure_temp[0] = figure[parent];
					figure[parent] = figure[child];
					figure[child] = figure_temp[0];
				}
				child = parent;
			}
		}
	}
	public static void heap(Figure[] figure) {
		Figure[] figure_temp = new Figure[1]; //임시 저장소
		for(int i=figure.length-1; i>0; i--) { //오름차순 정리
			figure_temp[0] = figure[0];
			figure[0] = figure[i];
			figure[i] = figure_temp[0];
			
			heap(figure, i);
		}
	}
}
