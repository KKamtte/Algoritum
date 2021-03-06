package Lv_2;
/*
작성일 : 2020-08-11

문제 : Insertion Sort
위 그림은 {5,2,4,6,1,3} 이라는 배열을 소트하는 방법을 보여준다.

배열의 두번째 인덱스부터 시작하여 시작한 인덱스(검정색 블록) 좌측의 항목 중 자신이 들어가야 할 위치를 판단(소트되도록)하여 이동 한다.
좌측의 배열 요소들은 본인보다 좌측에 값이 삽입되어 들어올 경우 한칸씩 우측으로 이동한다. 단, 삽입되어 들어오는 요소(그림에서 검정색 블록)가 있던 인덱스(원래의 위치)까지만 이동한다.
마지막 인덱스까지 위 과정을 반복한다.
이와 같은 기능을 하는 소트 프로그램을 작성하시오.

링크 : http://codingdojang.com/scode/443?answer_mode=hide
*/
public class insert_Sort {
	
	public static void main(String args[]) {
		int[] array = {5, 2, 4, 6, 1, 3}; //초기 배열
		int swap_area=0, temp=0; //초기 swap값
		boolean sort = false; //sort가 일어나야 되는지 판단하는 부울값
		
		for(int i=1; i<array.length; i++) {
			for(int j=(i-1); j>=0; j--) {
				if(array[i]<array[j]) { //sort가 일어나야 되는지 판단
					temp = array[i];
					swap_area = j;
					sort = true; //sort가 일어나야 할 경우 true로 바꿔줌
				}
			}
			
			//정렬이 필요한 경우
			if(sort) { //각 배열의 값을 하나씩 뒤로 미룸
				for(int j=i; j>swap_area; j--) {
					array[j] = array[j-1];
				}
				array[swap_area] = temp; //들어가야 할 자리로 배열값을 넣어줌
				sort = false; //정렬이 끝났으니 sort를 다시 false로 바꿔줌
			}
			
			//정렬 된 결과를 출력해 줌
			System.out.print(i + "번 째 정렬 결과\n{ ");
			for(int j=0; j<array.length; j++)
				System.out.print(array[j] + " ");
			System.out.print("}\n");
		}
	}
}
