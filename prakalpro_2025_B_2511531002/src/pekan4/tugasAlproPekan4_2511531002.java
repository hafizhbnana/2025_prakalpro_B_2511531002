package pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511531002 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nama pembeli : ");
		String nama = input.nextLine();
		System.out.print("Jumlah tiket : ");
		int jumlahTiket = input.nextInt();
		System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu) : ");
		int hari = input.nextInt();
		System.out.print("Waktu tayang (1=Pagi 10:00-12;00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00) : ");
		int waktu = input.nextInt();
		System.out.print("Jenis studio (1=Regular, 2=Deluxe, 3=Premium) : ");
		int studio = input.nextInt();
		
		int hargaDasar = 0;
		String jenisStudio = "";
		switch (studio) {
			case 1: hargaDasar = 40000; jenisStudio = "Regular"; break;
			case 2: hargaDasar = 50000; jenisStudio = "Deluxe"; break;
			case 3: hargaDasar = 70000; jenisStudio = "Premium"; break;
		}
		
		double persenHari = 0;
		String hariTayang = "";
		switch (hari) {
			case 1: persenHari = 0.1; hariTayang = "Senin-Kamis"; break;
			case 2: persenHari = 0.2; hariTayang = "Jumat"; break;
			case 3: persenHari = 0.3; hariTayang = "Sabtu-Minggu"; break;
		}
		int biayaHari = (int)(hargaDasar * persenHari);
		
		double tambahanHargaWaktu = 0;
		String waktuTayang = "";
		switch (waktu) {
			case 1: tambahanHargaWaktu = 0; waktuTayang = "Pagi"; break;
			case 2: tambahanHargaWaktu = 0.1; waktuTayang = "Siang"; break;
			case 3: tambahanHargaWaktu = 0.2; waktuTayang = "Malam"; break;
		}
		int biayaWaktu = (int)(hargaDasar * tambahanHargaWaktu);
		
		int totalSatuan = hargaDasar + biayaHari + biayaWaktu;
		
		int subtotalSebDiskon = totalSatuan * jumlahTiket;
		double persenDiskon = 0;
		if (jumlahTiket >= 7) {
			persenDiskon = 0.3;
		} else if (jumlahTiket >= 5 && jumlahTiket < 7 ) {
			persenDiskon = 0.2;
		} else if (jumlahTiket >= 3 && jumlahTiket < 5) {
			persenDiskon = 0.1;
		}
		int diskon = (int)(subtotalSebDiskon * persenDiskon);
		int total = subtotalSebDiskon - diskon;
		
		System.out.println();
		System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
		System.out.println("Nama Pembeli	: " + nama);
		System.out.println("Jumlah Tiket	: " + jumlahTiket);
		System.out.println("Hari		: " + hariTayang);
		System.out.println("Waktu Tayang	: " + waktuTayang);
		System.out.println("Jenis Studio	: " + jenisStudio);
		System.out.println("------------------------------------");
		System.out.println("Harga Dasar	: Rp. " + hargaDasar + "/tiket");
		System.out.println("Biaya Hari	: +" + (int)(persenHari * 100) + "%");
		System.out.println("Biaya Waktu	: +" + (int)(tambahanHargaWaktu * 100) + "%");
		System.out.println("Harga per Tiket	: Rp. " + totalSatuan);
		System.out.println("Subtotal		: Rp. " + subtotalSebDiskon);
		System.out.println("Diskon (" + (int)(persenDiskon * 100) + "%)	: Rp. " + diskon);
		System.out.println("------------------------------------");
		System.out.println("TOTAL BAYAR	: Rp " + total);
		
		input.close();
	}
}