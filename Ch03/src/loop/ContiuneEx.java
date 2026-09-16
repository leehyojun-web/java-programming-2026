package loop;

import java.util.Scanner;

public class ContiuneEx {

	public static void main(String[] args) {

		// 5개의 정수를 입력받아 더한 결과를 출력하는 반복문
		// 0과 음수는 빼고 더하시오.
		// 0또는 음수이면 종료
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		for (int i= 0; i< 5; i++) {
			int number = scanner.nextInt();
			if (number <= 0) {
				continue;
			}
			sum += number;
		}
		System.out.println("합은" + sum + "입니다.");
		
	}

}
