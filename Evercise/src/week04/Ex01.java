package week04;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 단을 입력하세요(2~9): ");
        int num = scanner.nextInt();

        gugudan(num);

        scanner.close();
    }

    static void gugudan(int num) {

        if (num >= 2 && num <= 9) {

            for (int j = 1; j <= 9; j++) {
                System.out.println(num + " * " + j + " = " + num * j);
            }

        } else {
            System.out.println("잘못입력되었습니다.");
        }
    }
}