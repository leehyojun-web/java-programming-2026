import java.util.Scanner;

public class BookAray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {

            System.out.print("제목 : ");
            String title = scanner.nextLine();

            System.out.print("저자 : ");
            String auth = scanner.nextLine();

            // 입력한 제목과 저자 정보로 객체 생성
            books[i] = new Book(title, auth);
        }
        	// 모든 책 정보를 출력하는 문장
        for (Book book : books) {
            book.print();
        }
    }
}