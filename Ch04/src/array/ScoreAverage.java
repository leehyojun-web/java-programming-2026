package array;

public class ScoreAverage {

	public static void main(String[] args) {
		
		//
//		int[][] intArray = new int[2][5];
//		System.out.println(intArray.length);
//		System.out.println(intArray[0].length);
//		System.out.println(intArray[1].length);
//		
//		int[][]intArray2 = new int[2][];
//		System.out.println(intArray2.length);
//		
//		intArray2[0] = new int[3];
//		intArray2[1] = new int[5];
//		System.out.println(intArray2[0].length);
//		System.out.println(intArray2[1].length);
		
		double[][] scores = {
				{3.3, 3.4},
				{3.5, 3.6, 4.0},
				{3.7, 4.0},
				{4.1, 4.2},
		};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		double sum = 0;
		int count = 0;
		for (int year = 0; year < scores.length; year++) {
			for (int term = 0; term < scores[year].length; term++) {
				sum += scores[year][term];
				count++;
			}
		}
		
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + sum / count);
		
		
		
	}
}