package pekan2;

import java.util.Scanner;

public class DataMahasiswa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input data
		System.out.print("Masukkan NIM Anda: ");
		String nim = input.nextLine();
		
		System.out.print("Masukkan Nama Lengkap Anda: ");
		String nama = input.nextLine();
		
		System.out.print("Masukkan Umur Anda: ");
		int umur = input.nextInt();	
		
		// Konversi umur menjadi String
		String umurString = String.valueOf(umur);
		
		// Konversi NIM menjadi Long lalu tambahkan dengan umur
		long nimLong = Long.parseLong(nim);
		long hasilPenjumlahan = nimLong + umur;
		
		// Output
		System.out.println("\n=== Data Mahasiswa ===\n");	
		System.out.println("NIM: " + nim);
		System.out.println("Nama: " + nama);
		System.out.println("Umur: " + umur + " Tahun");

		System.out.println("\nUmur (String): " + umurString);
		System.out.println("NIM + Umur: " + hasilPenjumlahan);
		
		input.close();
		
	}

}
