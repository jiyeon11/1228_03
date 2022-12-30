package info.VO;

import java.util.ArrayList;

public class BookDAO {
	ArrayList<BookVO> bvoList = new ArrayList<BookVO>();
	
	public void insert(BookVO bvo) {
		bvoList.add(bvo);
	}
	public ArrayList select() {
		return bvoList;
	}
}
