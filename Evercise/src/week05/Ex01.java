package week05;

import java.util.Scanner;

// 사용자에게 입력을 받아 해당 값이 있으면 인덱스를 출력하고 없으면 -1을 출력하는 프로그램
public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {
                "사과", "배", "바나나", "딸기", "포도", "파인애플"
        };

        // fruits 배열의 모든 과일 이름을 출력한다
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        System.out.println("찾고 싶은 과일을 입력하세요: ");
        String input = scanner.next();

        // 배열에서 input과 동일한 이름을 가지는 과일이 있으면
        // 해당 인덱스(첨자)를 출력하고, 없으면 -1을 출력한다
        int index = -1;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(input)) {
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}