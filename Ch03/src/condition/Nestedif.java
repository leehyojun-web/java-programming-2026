package condition;

import java.util.Scanner;

// 학년, 점수흫 입력받아
// 4학년인 경우 70이상 합격, 학년이 4학년이 아닌 경우에는 60이상 합격
public class Nestedif {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int score = scanner.nextInt();
		int year = scanner.nextInt();

		if (score >= 60) { 
			if (year != 4) {
				System.out.println("합격!"); 
			} else if (score >= 70) {
				System.out.println("합격!"); 
			} else {
				System.out.println("불합격!"); 
			}
		} else {
			System.out.println("불합격!");
		}

		scanner.close();
	}
}