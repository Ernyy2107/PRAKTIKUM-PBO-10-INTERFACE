/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author DELL
 */
public class MainTugas {
        public static void main(String[] args) {
   // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 1000000;
        double pajakElektronik =
                elektronik.hitungPajak(hargaElektronik);

        System.out.println("=== Produk Elektronik ===");
        System.out.println("Harga: Rp" + hargaElektronik);
        System.out.println("Pajak 10%: Rp" + pajakElektronik);
        System.out.println("Total: Rp" + (hargaElektronik + pajakElektronik));

    // Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 50000;
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        System.out.println("\n=== Produk Makanan ===");
        System.out.println("Harga: Rp" + hargaMakanan);
        System.out.println("Pajak 5%: Rp" + pajakMakanan);
        System.out.println("Total: Rp" + (hargaMakanan + pajakMakanan));
    } 
}
