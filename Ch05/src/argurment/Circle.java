package argurment;

public class Circle {
	int radius;
	String name;
	
	Circle() {  // 생성자
		radius = 10;
		name = "모름";
		
	}
	
	Circle(String name) {
		radius = 10;
		this.name = name;
	}
	
	Circle(int r, String name) {
		radius = r;
		this.name = name;
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.radius);
		System.out.println(this.getArea());
	}
}
