import java.util.Scanner;

public class Marvel13 {
    public static void main(String[] args) {
        // deklarasi
        Scanner sc13 = new Scanner(System.in);

        int biaya_per_meter_persegi13 = 200_000;
        int deposit13 = 500_000;
        int biaya_tenaga_kerja13 = 5_000_000;
        int panjang_dinding13;
        int tinggi_dinding13;
        int jumlah_dinding13;

        // input user

        System.out.println("Masukkan panjang dinding (dalam m):");
        panjang_dinding13 = sc13.nextInt();

        System.out.println("Masukkan tinggi dinding (dalam m):");
        tinggi_dinding13 = sc13.nextInt();

        System.out.println("Masukkan jumlah dinding");
        jumlah_dinding13 = sc13.nextInt();

        int luas_dinding13 =  panjang_dinding13 * tinggi_dinding13;
        int luas_total_semua_dinding13 = luas_dinding13 * jumlah_dinding13;

        int biaya_total_material13 = luas_total_semua_dinding13 * biaya_per_meter_persegi13;
        
        int total_biaya_material_dikurangi_deposit = biaya_total_material13 - deposit13;

        int total_biaya_pembangunan = biaya_tenaga_kerja13 + total_biaya_material_dikurangi_deposit;

        int biaya_rata_dari_pembangunan_dinding = total_biaya_material_dikurangi_deposit / jumlah_dinding13;
        
        System.out.println();

        System.out.println("Luas total semua dinding "+ luas_total_semua_dinding13 + "\n");
        System.out.println("Total biaya material dikurangi deposit " + total_biaya_material_dikurangi_deposit + "\n");
        System.out.println("Total biaya pembangunan " + total_biaya_pembangunan + "\n");
        System.out.println("Biaya rata-rata per meter persegi dari pembangunan semua dinding " + biaya_rata_dari_pembangunan_dinding + "\n");
    }
}
