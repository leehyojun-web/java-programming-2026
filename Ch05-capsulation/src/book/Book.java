package book;

//책제목과 저자 정보로 구성, 속성은 모두 private으로 한다
//생성자(매개변수가 있는)
//print() 메소드
public class Book {
	private String title;
	private String author;
	

    Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
	
	public void print() {
        System.out.println(this.title);
        System.out.println(this.author);

}
}