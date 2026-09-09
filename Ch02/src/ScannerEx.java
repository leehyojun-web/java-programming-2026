import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		
		String name = scanner.nextLine();
		System.out.println("이름은 " + name + "입니다.");
		
		String city = scanner.next();
		System.out.println("사는 도시는 " + city + "입니다. ");
		
		int age = scanner.nextInt();
		System.out.println("나이는 " + age + "입니다. ");

		scanner.close();
		
		
	}

}
