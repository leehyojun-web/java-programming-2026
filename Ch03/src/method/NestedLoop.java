package method;

public class NestedLoop {

	public static void main(String[] args) {
		gugudan();
	}
		static void gugudan() {
			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
					System.out.println("\t");
				}
				System.out.println();
			}
		}
	}

