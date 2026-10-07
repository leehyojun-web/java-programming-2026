package week06account;

import java.time.LocalDateTime;

public class Account {
	
	// 1. 다음 속성을 선언
	// owner, balance, transactionTime
	LocalDateTime transactionTime;
	String owner;
	int balance;
	
	//2. 생성자 정의
	//owner, balance 값 초기화 하는 생성자
	// this.transactionTime = LocalDateTime.now();
	Account() {}

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        this.transactionTime = LocalDateTime.now();
    }
	// 3. deposit, withdraw 메서드 정의
    public void deposit(int money) {
        balance += money;
        transactionTime = LocalDateTime.now();
    }
    
    public void withdraw(int money) {
        balance -= money;
        transactionTime = LocalDateTime.now();
    }
    
	
	// 4. 현재 계좌 상태를 출력하는 메서드 print()
    public void print() {
        System.out.println(this.owner);
        System.out.println(this.balance);
        System.out.println("거래시간 : " + transactionTime);
}
}

