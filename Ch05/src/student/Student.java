package student;

public class Student {

    String name;
    int studentnumber;
    int address;
    int phoneNumber;
    double gpa;

    Student() {}

    Student(String name, int studentnumber, int address,
            int phoneNumber, double gpa) {

        this.name = name;
        this.studentnumber = studentnumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    void print() {
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + studentnumber);
        System.out.println("주소 : " + address);
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("평점 : " + gpa);
    }
}