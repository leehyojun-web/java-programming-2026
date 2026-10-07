package argurment;

public class ParameterEx {
	
	//기본 타입의 값이 전달되는 경우
	static void increase(int m){
		m++;
		System.out.println("m = " + m);
	}
	
	static void increase(Circle m) {
		m.radius++;
		System.out.println("m.radius = " +m.radius);
	}
	
	static void increase(int[] m) {
		for (int i = 0; i<m.length; i++) {
			m[i]+=j
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println("n = " + n);
		
		Circle circle = new Circle(10, "원");
		increase(circle);
		System.out.println("circle.radius = " + circle.radius);

		int[] intArray = new int[2];
		intArray[0] = 10;
		intArray[1] = 10;
		System.out.println(intarray[0]);
		System.out.println(intarray[1]);
		
	}

}
