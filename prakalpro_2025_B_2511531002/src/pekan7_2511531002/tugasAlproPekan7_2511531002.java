package pekan7_2511531002;

import java.util.Scanner;

public class tugasAlproPekan7_2511531002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username: ");
		String userX = input.nextLine();
		System.out.print("Masukkan Password: ");
		String passY = input.nextLine();
		System.out.print("Masukkan Email: ");
		String emailZ = input.nextLine();
		System.out.print("Masukkan PIN (6 digit): ");
		int pinW = input.nextInt();
		
		Akun a = new Akun();
		a.setUser(userX);
		a.setPass(passY);
		a.setEmail(emailZ);
		a.setPin(pinW);
		
		boolean passBener = a.isPasswordValid();
		boolean emailBener = a.isEmailValid();
		
		if (passBener && emailBener) {
			System.out.println("\n--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \"" + userX + "\" telah berhasil dibuat.");
		} else {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			if (!passBener) {
				System.out.println("Password tidak valid (minimal 8 karakter).");
			}
			if (!emailBener) {
				System.out.println("Email Anda \"" + emailZ + "\" tidak valid (harus mengandung '@' dan '.').");
			}
			System.out.println("Silahkan coba lagi.");
			input.close();
			return;
		}
		
		System.out.println("\n--- Detail Akun ---");
		System.out.println("Username (Lowercase): " + userX.toLowerCase());
		System.out.println("Email (Uppercase)   : " + emailZ.toUpperCase());
		String idPengguna = userX + pinW;
		System.out.println("ID Pengguna: " + idPengguna);
		
		System.out.println("\n--- Uji Tipe Data (PIN Anda: " + pinW + ") ---");
		int hasilPin = pinW + 10;
		System.out.println("PIN (int) + 10	    = " + hasilPin);
		String pinString = String.valueOf(pinW);
		String hasilPinString = pinString + "10";
		System.out.println("PIN (String) + \"10\" = " + hasilPinString);
		
		input.close();
	}
}
