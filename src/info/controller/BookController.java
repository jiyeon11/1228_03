package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.VO.BookDAO;
import info.VO.BookVO;
import info.view.BookView;

public class BookController {
	ArrayList<String> isbn = new ArrayList<String>();
	ArrayList<String> bookName = new ArrayList<String>();
	ArrayList<String> publish = new ArrayList<String>();
	ArrayList<String> auther = new ArrayList<String>();
	ArrayList<String> price = new ArrayList<String>();
	ArrayList<String> category = new ArrayList<String>();
	
	public void console() {  //입력
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("====================================");
			System.out.print("도서제목 입력>>");
			bookName.add(scan.nextLine());
			System.out.print("저자명 입력>>");
			auther.add(scan.nextLine());
			System.out.print("도서번호 입력>>");
			isbn.add(scan.nextLine());
			System.out.print("출판사 입력>>");
			publish.add(scan.nextLine());
			System.out.print("카테고리 입력>>");
			category.add(scan.nextLine());
			System.out.print("가격 입력>>");
			price.add(scan.nextLine());
			System.out.println("====================================");
			System.out.print("계속 입력하시겠습니까?(계속:1 중지:2)>>");
			flag = sc.nextInt();
		}while(flag == 1);
		
	}
	
	public void voToDAO(BookDAO dao) {
		for(int i = 0; i<bookName.size(); i++) {
			BookVO bvo = new BookVO(isbn.get(i),auther.get(i),bookName.get(i), publish.get(i),price.get(i),category.get(i));
			dao.insert(bvo);
		}
	}
	public static void main(String[] args) {
		BookController controller = new BookController();
		controller.console();
		BookDAO dao = new BookDAO();
		controller.voToDAO(dao);
		BookView bView = new BookView();
		bView.view(dao.select());
	}

}
