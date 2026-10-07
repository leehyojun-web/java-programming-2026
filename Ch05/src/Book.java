	//책제목과 저자 정보로 구성
	//생성자(매개변수가 있는)
	//print() 메소드

public class Book {

    String title;
    String auth;

    Book() {}

    Book(String title, String auth) {
        this.title = title;
        this.auth = auth;
    }

    void print() {
        System.out.println(this.title);
        System.out.println(this.auth);
    }
}

