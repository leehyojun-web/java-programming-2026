package circle;

public class Circle {
	int radius;
	String name;
	
	Circle() {  // 생성자
		radius = 10;
		name = "모름";
		
	}
	
	Circle(String n) {
		radius = 10;
		name = n;
	}
	
	Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	void print() {
		System.out.println(name);
		System.out.println(radius);
		System.out.println(getArea());
	}
}
