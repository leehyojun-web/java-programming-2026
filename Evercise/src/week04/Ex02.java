package week04;

import java.util.Scanner;

// 계산기 프로그램
public class Ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 무한반복
        while (true) {

            // 연산자, 피연산자1, 피연산자2를 입력받는다.
            System.out.print(">> ");
            String operator = scanner.next();

            // 잘못된 입력인 경우(없는 연산자를 입력한 경우) 프로그램을 종료한다.
            if (!operator.equals("+") &&
                !operator.equals("-") &&
                !operator.equals("*") &&
                !operator.equals("/")) {
            
                System.out.println("잘못된 연산자입니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
                
            }
            
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // 연산자의 종류에 따라 계산
            int result = 0;

            switch (operator) {

            case "+":
                result = add(num1 + num2);
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
            	if (num2 == 0) {
            		System.out.println("0으로 나눌 수 없습니다");
            		continue;
            	}
                result = num1 / num2;
                break;
            	
            }

            // 그 결과를 출력한다.
            System.out.println("결과 : " + result);
        }

        scanner.close();
    }
    static int add(int x, int y) {
    	return x + y;
    }
    static int substract(int x, int y) {
    	   return x - y;
    }
}

