package array;

public class ArrayEx {

	public static void main(String[] args) {
		
		//int intArray[]; // 배열 참조 변수
		//int[] intArray;	
		//intArray = new int[5];
		
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[2] = 4;
		System.out.println(intArray[2]);
		
		// intArray[5] = 10; //오휴
		
		double[] doubleArray = { 0.01, 0.02, 0.03, 0.04, 0.05 };
		System.out.println(doubleArray[4]);
		
		for (int i= 0; i < 5; i++) {
			System.out.println(doubleArray[i]);
		}
		
		double[] myArray = doubleArray;
		System.out.println(myArray[3]);
		
		myArray[3] = 0.07;
		System.out.println(doubleArray[3]);
		
	}

}
