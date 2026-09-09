
public class TypeConversionEx {

	public static void main(String[] args) {
		
		int n = 300;
		byte b = (byte)n;
		
		System.out.println(b);

		double d = 1.9; //소수점 이하를 강제 형변환을 하면 소수점 아래는 버림
		n = (int)d;
		
		System.out.println(n);
		
		System.out.println(10 / 4);
		System.out.println(10 / 4.0);
		System.out.println((byte)(127 + 1));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));

		// var 키워드, 당분간은 사용하지 맙시다
		var price = 200;
//		var noValue;
		var money = 15.5;

	}

}
