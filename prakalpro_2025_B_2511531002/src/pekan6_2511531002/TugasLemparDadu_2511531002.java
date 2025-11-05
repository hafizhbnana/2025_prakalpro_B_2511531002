package pekan6_2511531002;

import java.util.Random;
import java.util.Scanner;

public class TugasLemparDadu_2511531002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int sum = 0;
		int tries = 0;
		String jawab;
		boolean running = true;
		
		while (running) {
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2;
			
			System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
			tries++;
			
			if (sum == 7) {
				System.out.println("Anda menang setelah " + tries + " percobaan!");
				break;
			} else {
				System.out.println("Tebakan Anda Salah");
				System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
				jawab = scan.nextLine();
				if (jawab.equalsIgnoreCase("tidak")) {
					System.out.println("Anda gagal menang");
					break;
				}
			}
		}
		scan.close();
	}
}
