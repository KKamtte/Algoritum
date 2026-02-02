//파일명 : MergeSortTest
//작성자 : 김승현
//작성일 : 2020-04-16
//내용 : [hw4_5] merge sort

import java.util.Scanner;

public class MergeSortTest {
	public static void main(String[] args) {
		System.out.println("hw4_5 : 김승현");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n원 갯수 입력 :");
		int n1 = sc.nextInt(); //원 갯수
		
		System.out.print("삼각형 갯수 입력 :");
		int n2 = sc.nextInt(); //삼각형 갯수
		
		Figure[] figureArray = new Figure[n1+n2]; //크기가 n1+n2인 도형 배열 생성
		
		System.out.println("\n"+n1 + "개의 원 정보(반지름)를 입력하세요:");
		
		for(int i=0; i<n1; i++) {
			double rad = sc.nextDouble(); //반지름 정보 입력받음
			figureArray[i] = new Circle(rad); //객체정보 배열에 저장
		}
		
		System.out.println("\n"+n2 + "개의 삼각형 정보(밑변과 높이)를 입력하세요:");
		for(int i=n1; i<n1+n2; i++) {
			figureArray[i] = new Triangle(sc.nextDouble(), sc.nextDouble());
		}
		/*
		System.out.println("\n5개의 도형 정보와 면적 =");
		for(int i=0; i<figureArray.length; i++) {
			System.out.println(figureArray[i].toString());
		}
		
		System.out.println("merge Sort 출력");
		*/
		System.out.println("\n병합 정렬 결과 5개의 도형 정보와 면적 =");
		FigureSortService.mergeSort(figureArray);
		for(int i=0; i<figureArray.length; i++) {
			System.out.println(figureArray[i].toString());
		}
	}
}
