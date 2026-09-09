
public class PrintEx {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		
		System.out.print("내 이름은 ");
		System.out.println("이효준입니다.");
		
		System.out.printf("%d", 123);
		System.out.println();
		
		System.out.printf("%d", 123, 456);
		System.out.println();
		
		System.out.printf("%d / %d = %f\n", 100, 200 , (double)100 / (double)200);
		System.out.printf("%d / %d = %.2f\n", 100, 200 , (double)100 / (double)200);

		System.out.printf("%d / %d = %.2f\n", 100, 200 , 0.127);

		
	}

}
