import java.util.Scanner;

public class Hw0_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hw0_2 : 김승현");
		System.out.println("양의 정수 집합을 비교하는 프로그램입니다.");
		System.out.println("");
		
		int i = 0;
		int j = 0;
		int[] array1 = new int[100];
		int[] array2 = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		//첫번째 집합 입력받음
		System.out.print("첫번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		for(i=0; i<100; i++) {
			int i1 = sc.nextInt();
			if(i1 > 0) {
				array1[i] = i1;
				//System.out.print("array1["+i+"] = "+array1[i]);
				//System.out.println("");
			}
			else {
				break;
			}
		}
		
		/* array1 입력값
		for(int i1=0; i1<i; i1++) {
			System.out.print(array1[i1]+" ");
		}
		
		System.out.println("입력완료"+i);
		*/
		
		//첫번째 집합 크기순 정렬
		for(int i1=0; i1<i-1; i1++) {
			for(int i2=i1+1; i2<i; i2++) {
				if(array1[i1] > array1[i2]) {
					int x = array1[i2];
					array1[i2] = array1[i1];
					array1[i1] = x;
				}
			}
		}
		
		/* array1 정렬값
		for(int i1=0; i1<i; i1++) {
			System.out.print(array1[i1]+" ");
		}
		System.out.println("정렬완료");
		*/
		
		//두번째 집합 입력받음
		System.out.print("두번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		for(j=0; j<100; j++) {
			int j1 = sc.nextInt();
			if(j1 > 0) {
				array2[j] = j1;
				//System.out.print("array2["+j+"] = "+array2[j]);
				//System.out.println("");
			}
			else {
				break;
			}
		}
		
		/* array2 입력값
		for(int j1=0; j1<i; j1++) {
			System.out.print(array2[j1]+" ");
		}
		
		System.out.println("입력완료"+j);
		*/
		
		//두번째 집합 크기순 정렬
		for(int j1=0; j1<j-1; j1++) {
			for(int j2=j1+1; j2<j; j2++) {
				if(array2[j1] > array2[j2]) {
					int x = array2[j2];
					array2[j2] = array2[j1];
					array2[j1] = x;
				}
			}
		}
		
		/* array2 정렬값
		for(int j1=0; j1<j; j1++) {
			System.out.print(array2[j1]+" ");
		}
		System.out.println("정렬완료");
		*/
		
		//집합비교
		if(i == j) {
			//System.out.println("크기같음");
			for(i=0; i<j; i++) {
				if(array1[i] != array2[i]) {
					//System.out.println("array1["+i+"] = "+array1[i]+" && "+"array2["+i+"] = "+array2[i]);
					System.out.println("두 집합은 다릅니다.");
					break;
				}else if(array1[i] == array2[j-1]) {
					System.out.println("두 집합은 같습니다.");
				}
			}
		}
		else {
			System.out.println("두 집합은 다릅니다.");
		}
		//System.out.println("크기비교 완료");
	}
	
}
