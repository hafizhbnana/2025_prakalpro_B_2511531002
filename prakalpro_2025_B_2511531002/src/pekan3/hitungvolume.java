package pekan3;
import java.util.Scanner;
public class hitungvolume {
	public static void main(String [] args) {
		float a, ts, t;
		float luasAlas, volume;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Masukkan alas segitiga: ");
		a = keyboard.nextFloat();
		System.out.print("Masukkan tinggi segitiga: ");
		ts = keyboard.nextFloat();
		System.out.print("Masukkan tinggi prisma: ");
		t = keyboard.nextFloat();
		keyboard.close();
		
		luasAlas = 0.5f * a * ts;
		volume = luasAlas * t;
		
		System.out.printf("Volume prisma segitiga = %.1f\n", volume);
	}
}