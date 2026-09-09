
public class OperatorEx {

	public static void main(String[] args) {

		// 논리연산자
		boolean result = 3 != 2;
		System.out.println(result);
		
		result = -1 > 0;
		System.out.println(result);
		
		result =(3 != 2) || (-1 > 0);
		System.out.println(result);

		// 증감연산자 : ++, --
		int number = 3;
		
		int result2 = number++;
		System.out.println(result2);
		
		number++;
		
		//사망연산자 : ? :
		int x = 3;
		int y = 5;
		
		int diff = (x > y) ? x - y : y - x;
		System.out.println(diff);
		
		//문자열연산 +
		String language = "Java";
		String subject = language + " Programming";
		System.out.println(subject);
		
		String javaVersion = language +25;
		System.out.println(javaVersion);

	}

}
