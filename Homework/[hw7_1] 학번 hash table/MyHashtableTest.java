//파일명 : MyHashtableTest
//작성자 : 김승현
//작성일 : 2020-05-15
//내용 : [hw7_1] 학번 hash table

import java.util.Scanner;

public class MyHashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1 : 김승현");
		
		Scanner sc = new Scanner(System.in);
		int size, n, x, count;
		
		System.out.print("해시테이블 크기 입력 : ");
		size = sc.nextInt();
		MyHashtable ht = new MyHashtable(size);
		count = 0;
		
		while(true) {
			System.out.print("\n1.삽입 2.검색 3.삭제 4.테이블출력 5.종료--->");
			n = sc.nextInt();
			
			if(n==1) {
				if(count==size){
					System.out.println("배열이 가득 찼습니다.");
				}
				else {
					System.out.print("삽입할 학번(정수값)을 입력하세요:");
					x = sc.nextInt();
					if(ht.put(x)) {
						System.out.println(x + " 삽입 성공");
						count += 1;
					}
					else
						System.out.println(x + " 삽입 실패");
				}
			}
			else if(n==2) {
				System.out.print("검색할 학번(정수값)을 입력하세요:");
				x = sc.nextInt();
				if(ht.contain(x))
					System.out.println(x + " 검색 성공");
				else
					System.out.println(x + " 검색 실패");
			}
			else if(n==3) {
				System.out.print("삭제할 학번(정수값)을 입력하세요:");
				x = sc.nextInt();
				if(ht.remove(x)) {
					System.out.println(x + " 삭제 성공");
					count -= 1;
				}					
				else
					System.out.println(x + " 삭제 실패");
			}
			else if(n==4) {
				ht.print();
			}
			else if(n==5) {
				break;
			}
		}
	}

}
