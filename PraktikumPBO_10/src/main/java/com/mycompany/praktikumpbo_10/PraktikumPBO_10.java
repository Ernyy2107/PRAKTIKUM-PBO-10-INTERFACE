/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_10;

import praktikum10.OperasiHitung;
import praktikum10.Pengurangan;
import praktikum10.Penjumlahan;

/**
 *
 * @author DELL
 */
public class PraktikumPBO_10 {

    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5));
        
        //Objek Pengurangan 
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5));
    }
}
