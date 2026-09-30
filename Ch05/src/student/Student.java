package student;

public class Student {
	
	String name;
	int studentnumber;
	int address;
	int phonenumber;
	int gpd;
	
	Student(String n) {
		studentnumber = 20231026;
		address = 1313;
		phonenumber = 8445;
		gpd = 100;
		name = n;
	}
	
	Student (int a,int b, int c, int d, String n) {
		studentnumber = a;
		address = b;
		phonenumber = c;
		gpd = d;
		name = n;
	}
	
	Student() {  
		name = "재혁";
		studentnumber = 20231025;
		address = 1414;
		phonenumber = 8282;
		gpd = 100;
		
	}
	
	
	
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentnumber);
		System.out.println("주소 : " + address);
		System.out.println("전화번호 : " + phonenumber);
		System.out.println("평점 : " + gpd);
	}
}
