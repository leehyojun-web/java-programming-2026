package condition;

import java.util.Scanner;
// 숫자로 월을 입력하면 봄, 여름, 가을, 겨울을 출력하는 프로그래
public class season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch (month) {
			case 3, 4, 5:
				System.out.println("봄입니다.");
				break;
			case 6, 7, 8:
				System.out.println("여름입니다.");
				break;
			case 9, 10, 11:
				System.out.println("가을입니다.");
				break;
			case 12:
			case 1:
			case 2: 			
				System.out.println("겨울입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다");		
		}
		
		// 문자열 리터럴 체크
		String hangul = "봄";
		String english = "";
		
		switch (hangul) {
		case "봄":
			english = ("Spring");
			break;
		case "여름":
			english = ("Summer");
			break;
		case "가을":
			english = ("Fall");
			break;
		case "겨울":
			english = ("Winter");
			break;
		default : 
			english = "Unknown";
		}
		
		System.out.println();
	}

	
}
