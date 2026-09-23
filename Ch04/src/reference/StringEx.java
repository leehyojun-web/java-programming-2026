package reference;

public class StringEx {

	public static void main(String[] args) {
		
		String name = "홍길동"; // name 참조 변수
		String hobby = "여행";
		
		String name2 = "홍길동";
		String hobby2 = "독서";
		
		String name3 = new String("홍길동");
		
		boolean result = name == name2;
		System.out.println(result);
		
		boolean result3 = name == name3;
		System.out.println(result3);
		
		System.out.println(name.equals(name3));
		System.out.println(name.equals(name2));

		boolean result2 = hobby == hobby2;
		System.out.println(result2);
		
		String address = null;
		System.out.println(address);
		
		System.out.println(name3.length());
		System.out.println(address.length());
		
		
	}

}
