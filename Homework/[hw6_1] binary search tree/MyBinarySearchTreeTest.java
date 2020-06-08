//파일명 : MyBinarySearchTreeTest
//작성자 : 김승현
//작성일 : 2020-05-01
//내용 : [hw6_1] binary search tree

import java.util.Scanner;

public class MyBinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : 김승현\n선택과제 수행했습니다.");
		MyBinarySearchTree bt = new MyBinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("\n수행작업 선택 \n1.삽입 2.검색 3.삭제 4.전체조회 5.종료 : ");
			n = sc.nextInt();
			
			if(n==1) {
				System.out.print("(삽입)아이디 입력 : ");
				String id = sc.next();
				//System.out.println(bt.add(id));
				if(bt.add(id)==true) {
					System.out.println("아이디 추가에 성공하였습니다.");
				} else {
					System.out.println("아이디 추가에 실패하였습니다.");
				}
			} else if(n==2) {
				System.out.print("(검색)아이디 입력 : ");
				String id = sc.next();
				//System.out.println(bt.contain(id));
				if(bt.contain(id)==true) {
					System.out.println("존재하는 아이디 입니다.");
				} else {
					System.out.println("존재하지 않는 아이디 입니다.");
				}
			} else if(n==3) {
				System.out.print("(삭제)아이디 입력 : ");
				String id = sc.next();
				//System.out.println(bt.remove(id));
				if(bt.remove(id)==true) {
					System.out.println("아이디 삭제에 성공하였습니다.");
				} else {
					System.out.println("아이디 삭제에 실패하였습니다.");
				}
			} else if(n==4) {
				bt.print();
			} else if(n==5) {
				break;
			}
		}
	}

}
