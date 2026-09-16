package loop;

public class ForEx {

	public static void main(String[] args) {
		
		// 1부터 10까지 더하는 반복문
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum =" + sum);
		
		//10번 자바를 출력하는 반복문
		for(int i = 1; i < 10; i++) {
			System.out.println("자바");
		}
	}

}
