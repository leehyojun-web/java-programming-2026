package circle;

public class CircleMain {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		
		pizza.name = "피자";
		pizza.radius = 10;
		System.out.println(pizza.name);
		System.out.println(pizza.radius);
		System.out.println(pizza.getArea());
		
		Circle face = new Circle();
		face.name = "얼굴";
		face.radius = 6;
		System.out.println(face.name);
		System.out.println(face.getArea());
		
		Circle unknown = new Circle();
		System.out.println(unknown.name);
		System.out.println(unknown.getArea());
		
		Circle plate = new Circle(20, "접시");
		plate.print();
		
		Circle donut = new Circle("도넛");
		donut.print();
		

	}

}
