/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
// makanan.java
public class makanan {

    // atribut
    String nama;
    int harga;

    // constructor tanpa parameter
    public makanan() {
        nama = "Nasi Goreng";
        harga = 15000;
        System.out.println("constructor tanpa parameter jalan");
    }

    // constructor dengan parameter
    public makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        System.out.println("constructor dengan parameter jalan");
    }

    // method tanpa nilai balik
    public void tampilData() {
        System.out.println("Nama Makanan : " + nama);
        System.out.println("Harga : " + harga);
    }

    // method dengan nilai balik
    public String getInfo() {
        return nama + " - Rp" + harga;
    }
}
