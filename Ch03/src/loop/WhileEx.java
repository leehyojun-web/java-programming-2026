package loop;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		//1에서 100까지 더하는 반복문
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("Sum = " + sum);
		
		// 입력받은 숫자를 계속 더함. 단 0이 입력되면 종료
		Scanner scanner = new Scanner(System.in);
		sum = 0;
		
		int number;	
		while ((number = scanner.nextInt()) != 0) {
			sum += number;
		}
		
		System.out.println("Sum = " + sum);
		
	}

}
