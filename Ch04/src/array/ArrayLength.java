package array;

public class ArrayLength {

	public static void main(String[] args) {
		
		int[] intArray = { 3, 8, 4, 2, 9, 7 };
		
		//배열의 모든 값을 합하여 출력하시오.
		int sum = 0;
		for (int i= 0; i < 6; i++) {
			sum += intArray[i];
		}
			System.out.println("Sum = " + sum);
	
		sum = 0;
		for (int i= 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
			System.out.println("Sum = " + sum);
	
			System.out.println("Method Sum = "+ sum(intArray));
			
			// For-each
			sum = 0;
			for (int value : intArray) {
				sum += value;
			}
			System.out.println("For-each Sum = " + sum);
}
	
	static int sum(int[] array) {
		int sum = 0;
		for (int i =0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}