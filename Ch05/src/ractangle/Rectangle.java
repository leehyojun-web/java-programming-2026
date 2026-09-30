package ractangle;

// width, height, getArea()
public class Rectangle {
	int width;
	String name;
	int height;
	
	// 매개변수 없는 생성자
	Rectangle() { 
		width = 10;
		height = 10;
		name = "모름";
		
	}
	
	// 매개변수를 모두 지정한 생성자
	Rectangle(String n) {
		width = 10;
		height = 15;
		name = n;
	}
	
	Rectangle(int r,int h, String n) {
		width = r;
		height = h;
		name = n;
	}
	
	double getArea() {
		return width * height;
	}
}
