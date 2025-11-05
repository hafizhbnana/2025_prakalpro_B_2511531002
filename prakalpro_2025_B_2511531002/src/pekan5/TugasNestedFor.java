package pekan5;

public class TugasNestedFor {
	public static void main(String[] args) {
		int n = 4;
		
		System.out.print("#");
		System.out.print("================");
		System.out.println("#");
		
		for (int i = 0; i < n * 2 - 1; i++) {
			System.out.print("|");

			int space, titik;

			if (i < n) {
				space = (n - 1 - i) * 2;
				titik = i * 4;
			} else {
				space = (i - (n - 1)) * 2;
				titik = (n * 2 - 2 - i) * 4;
			}

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			System.out.print("<>");
			for (int j = 0; j < titik; j++) {
				System.out.print(".");
			}
			System.out.print("<>");

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			System.out.println("|");
		}
		
		System.out.print("#");
		System.out.print("================");
		System.out.println("#");
	}
}
