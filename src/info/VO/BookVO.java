package info.VO;

public class BookVO {
	private String isbn; //도서번호
	private String bookName; //도서이름
	private String publish;  //출판사
	private String auther;  //저자명
	private String price;   //가격
	private String category;  //카테고리
	
	public BookVO() {
		
	}
	public BookVO(String isbn, String auther, String bookName, String publish, String price, String category) {
		this.isbn = isbn;
		this.auther = auther;
		this.bookName = bookName;
		this.publish = publish;
		this.price = price;
		this.category = category;
	}
	//getters and setter
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", bookName=" + bookName + ", publish=" + publish + ", price=" + price
				+ ", category=" + category + "]";
	}
	
}
