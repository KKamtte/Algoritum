
public class FigureSortService {
	public static void mergeSort(Figure[] figure) {
		mergeSort(figure, 0, figure.length);
	}
	
	public static void mergeSort(Figure[] figure, int low, int high) {
		//배열 갯수가 하나일 때 리턴
		if(high - low < 2) {
			return;
		}
		
		int mid = (low + high) / 2; //배열 반으로 쪼갬
		mergeSort(figure, 0, mid); //배열 앞부분
		mergeSort(figure, mid, high); //배열 뒷부분
		merge(figure, low, high); //병합
	}
	
	public static void merge(Figure[] figure, int low, int high) {
		int t = 0, l = low, h = (low + high) / 2;
		Figure temp[] = new Figure[high]; //임시 저장소 사용
		
		while(l < (low + high) / 2 && h < high) { //배열 계산
			if(figure[l].getArea() < figure[h].getArea()) {
				temp[t++] = figure[l++]; //뒷배열이 클경우 앞배열 저장 후 증가
			} else {
				temp[t++] = figure[h++]; //반대작업
			}
		}
		
		//위 조건문에 해당하지 않는 배열들 확인 후 저장
		while(l < (low + high) / 2) {
			temp[t++] = figure[l++];
		}
		
		while(h < high) {
			temp[t++] = figure[h++];
		}
		
		//배열 순서 임시 저장소에서 꺼내서 재정리
		for(int i=low; i<high; i++) {
			figure[i] = temp[i - low];
		}
	}
}
