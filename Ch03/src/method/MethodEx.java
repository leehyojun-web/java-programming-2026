package method;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		// 2개의 정수를 입력 받아 더한 결과를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		// 2개 정수의 값을 더한다
		int result = add(number1, number2);
				
		//결과를 출력한다
		printResult(result);
	}
	
	
	// method
	static int add(int a, int b) {
		return a + b;
	}

	static void printResult(int result) {
		System.out.println("계산 결과는 "  + result + "입니다.");
	}
