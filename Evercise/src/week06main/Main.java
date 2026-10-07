package week06main;

import java.util.Scanner;

import week06account.Account;

public class Main {

    public static void main(String[] args) {

    	 Scanner scanner = new Scanner(System.in);

        // 계좌 정보 생성
        Account account = new Account("효준", 10000);

        // 입출금
        System.out.print("입금할 금액 : ");
        int depositMoney = scanner.nextInt();
        account.deposit(depositMoney);

        System.out.print("출금할 금액 : ");
        int withdrawMoney = scanner.nextInt();
        account.withdraw(withdrawMoney);

        // 상태 출력
        account.print();
    }
}

