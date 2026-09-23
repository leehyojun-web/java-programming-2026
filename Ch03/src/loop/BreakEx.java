package loop;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {

		//반복적으로 명령을 입력 받아... 그대로 출력한다.
		//단, exit가 입력되면 종료한다.
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println(">> ");
			String command = scanner.nextLine();
			if (command.equals("exit")) {
				break;
			}
			
			System.out.println(command);
		}
		
		System.out.println("종료합니다.");
	}

}
