package condition;

import java.util.Scanner;

//나이를 입력받아서 20대이면 20대입니다. 라고 출력하고
//20대가 아니면 20대가 아닙니다. 라고 출력하는 프로그램
public class Twenties {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하시요: ");
		int age = scanner.nextInt();
			
		if ((age >= 20) && (age <= 29)) {
			System.out.println("20대 입니다");
		} else {
			System.out.println("20대가 아닙니다");
		}
		
	}

}
