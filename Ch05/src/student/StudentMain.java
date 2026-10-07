package student;

public class StudentMain {
	    public static void main(String[] args) {

//	    	Student student = new Student();
	    	
        Student s1 = new Student("효준", 20231026, 1313, 8445, 100);
        Student s2 = new Student("재혁", 20231025, 1414, 8282, 100);
        Student s3 = new Student("용연", 20231027, 1515, 8383, 95);

        s1.print();
        System.out.println();

        s2.print();
        System.out.println();

        s3.print();
    }
}