package ractangle;

public class RectangleMain {

	// 테블릿 만들고 활용해보기
	public static void main(String[] args) {
		Rectangle tab = new Rectangle();
		
		tab.name = "테블릿";
		tab.width = 10;
		tab.height = 20;
		
		System.out.println(tab.name);
		System.out.println(tab.width);
		System.out.println(tab.height);
		System.out.println(tab.getArea());
		
		
		Rectangle unknown = new Rectangle();
		System.out.println(unknown.name);
		System.out.println(unknown.getArea());
		
		Rectangle phone = new Rectangle("핸드폰");
		System.out.println(phone.name);
		System.out.println(phone.getArea());
		
	}
		
	}

