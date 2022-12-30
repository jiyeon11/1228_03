package info.view;

import java.util.ArrayList;

import info.VO.BookVO;

public class BookView {
	public void view(ArrayList<BookVO> bvoList) {
		for(BookVO bvo : bvoList) {
			System.out.println("====================================");
			System.out.print("도서명 : " + bvo.getBookName() + "\n");
			System.out.print("저자명 : " + bvo.getAuther() + "\n");
			System.out.print("출판사명 : " + bvo.getPublish() + "\n");
			System.out.print("도서번호(isbn) : " + bvo.getIsbn() + "\n");
			System.out.print("가격 : " + bvo.getPrice() + "\n");
			System.out.print("카테고리 : " + bvo.getCategory() + "\n");
		}
	}
}
